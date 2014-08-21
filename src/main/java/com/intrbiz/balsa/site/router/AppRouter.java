package com.intrbiz.balsa.site.router;

import java.io.IOException;

import com.intrbiz.Util;
import com.intrbiz.balsa.engine.route.Router;
import com.intrbiz.balsa.error.view.BalsaViewNotFound;
import com.intrbiz.balsa.site.BalsaSite;
import com.intrbiz.metadata.Any;
import com.intrbiz.metadata.Catch;
import com.intrbiz.metadata.Prefix;
import com.intrbiz.metadata.Template;

@Prefix("/")
@Template("layout/main")
public class AppRouter extends Router<BalsaSite>
{    
    @Any("/**:path")
    public void serve(String path)
    {
        if (Util.isEmpty(path)) path = "index";
        if (path.endsWith("/")) path = path + "index";
        encode(path);
    }
    
    @Catch(BalsaViewNotFound.class)
    @Any("/**")
    public void viewNotFound() throws IOException
    {
        encode("error/not-found");
    }
}
