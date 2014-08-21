# What is Balsa?

Balsa lightweight Java web framework, which aims to simplify building web 
applications in Java.

Balsa is:

 * Light  - standalone SCGI based application server
 * Simple - only two classes required to create a basic application
 * Clean  - clear separation between routing, model, views and logic
 * Quick  - works with the webserver, designed to be efficient
 * Free   - licensed under the GNU LGPL

## Hello World

    public class HelloWorldRouter
    {
        @Any("/hello/world")
        @Text()
        public String helloWorld()
        {
            return "Hello World";
        }
    }
    
    public class HelloWorld
    {
        public void setup() throws Exception
        {
            router(new HelloWorldRouter);
        }
        
        public static void main(String[] args) throws Exception
        {
            new HelloWorld.start();
        }
    }

## Getting Started

Balsa uses Maven to manage dependencies and building, with Balsa archetype you 
can quickly bootstrap your project.  Create you project using the 
`com.intrbiz.balsa:balsa-archetype` archetype, with the following command:

    # mvn -DarchetypeCatalog=http://nexus.intrbiz.net/nexus/content/repositories/snapshots/ archetype:generate



