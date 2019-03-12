/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection_demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class HttpURLConnection_Demo 
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        InputStream is = openHttpConnection("https://www.orgsports.com/");
        System.out.println(is);
    }
    
    private static InputStream openHttpConnection(String urlString)
    {
        int response = -1;
        InputStream in = null;

        try 
        {
            
            // instantiate the URL object with the target URL of the resource to
            // request
            URL url = new URL(urlString);

            
            // 1. This is the point where the connection is opened.
            URLConnection connection = (HttpURLConnection) url.openConnection();

            HttpURLConnection httpConnection = (HttpURLConnection)connection;
            httpConnection.setAllowUserInteraction(false);
            httpConnection.setInstanceFollowRedirects(true);
            httpConnection.setRequestMethod("GET");
            httpConnection.connect();
            
            response = httpConnection.getResponseCode();
            
            if (response == HttpURLConnection.HTTP_OK)
            {
                in = httpConnection.getInputStream();
            }
            else 
            {
                // ungood
            }
        }
        catch (UnsupportedEncodingException ex) 
        {
            Logger.getLogger(HttpURLConnection_Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (MalformedURLException e) 
        {
            // 
        } 
        catch (IOException e) 
        {
            // ("IOException");
        }
        catch (Exception ex) 
        {
            // 
        }
        
        return in;
    }
}
