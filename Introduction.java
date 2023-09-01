class Introduction
{
 public static void main(String...args)
 {

 }
}
/*
Servlet --> Generates Dynamic web Application
            used in server side programming language

Early days: CGI

Common Gateway Interface
Language dependent -- C , C++ , Perl
each request it creates a process
if  multiple request send meant time consumed to send the response


Servlet
Each request sepereate thread creates
thread shares common memory area
lightweight,communication between the threads less cose
better performance 
robust
scalable
portable

HTTP -- it is used for database communication 
protocol establish the connection between client and server


Static page -- html is enough
               page content is static 


Dynamic page --- jsp servlet etc needed
                 according to user input page will be reacted.
                 page content dynamic in nature
                 more interactive



Web Server -->

               apache tomcat
               handles the http request and http response
               static page content
               if the url mismatched it give 404 error
      
Dynamic server -->
                  jboss
                  glassfish
                  websphere
                 enterprise applications
                 ejb  jsp servlet used
                 used to manage and host the dynamic websites               

GET
          data exposes to the url
          not secured
          more efficient
          limited data send
          data send in header
          it can be bookmarked
          second request should wait until the first request completed
          good for retrieving the data


POST

           data is not exposed in the url
           secured
           less efficient
           large amount of data can be sent
           data send in the body
           it cannot be bookmarked



Container -- web container or server container

web server inside web container presented
web container holds the servlet


Content-Type -- Header of the description what actually the browser did
           


Servlet  --- > javax.servlet  --contains classes and interfaces used by the servlet or web container
 * 
 * INTERFACES
 * 
 * RequestDispatcher
 * Servlet
 * ServletRequest
 * ServletResponse
 * ServletConfig
 * ServletContext
 * FilterConfig
 * FilterChain
 * Filter
 * ServletRequestListener
 * ServletContextListener
 * ServletRequestAttributeListener
 * ServletContextAttributeListener
 * 
 * 
 * CLASSES
 * 
 * Generic Servlet
 * ServletOutputStream
 * ServletInputStream
 * ServletRequestWrapper
 * ServletResponseWrapper
 * ServletRequestEvent
 * ServletContextEvent
 * ServletContextAttributeEvent
 * ServletRequstAttributeEvent
 * ServletException
 * UnavailableException
 * 
 * 
 * 
 * 
 * Http ---> javax.servlet.http
 *contains classes and interfaces used by the http request only 
 * 
 * 
 * INTERFACE
 * 
 * HttpServletRequest
 * HttpServletResponse
 * HttpSession
 * HttpSessionAttributeListener
 * HttpSessionBindingListener
 * HttpSessionActivationListener
 * HttpSessionListener
 * 
 * 
 * CLASSES
 * HttpServlet
 * Cookie
 * HttpServletRequestWrapper
 * HttpServletResponseWrapper
 * HttpSessionEvent
 * HttpSessionBindingEvent
 
 */