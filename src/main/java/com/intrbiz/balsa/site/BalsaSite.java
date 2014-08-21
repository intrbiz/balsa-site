package com.intrbiz.balsa.site;

import com.intrbiz.balsa.BalsaApplication;
import com.intrbiz.balsa.BalsaMarkdown;
import com.intrbiz.balsa.site.router.AppRouter;

public class BalsaSite extends BalsaApplication
{
    @Override
    protected void setup()
    {
        // Setup Markdown support
        BalsaMarkdown.enable(this);
        // Setup the application routers
        router(new AppRouter());
    }
    
    public static void main(String[] args) throws Exception
    {
        BalsaSite balsaSite = new BalsaSite();
        balsaSite.start();
    }
}
