package segmentationanalyzer;


import ij.IJ;
import ij.ImageJ;
import ij.ImagePlus;
import ij.plugin.PlugIn;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.scijava.Context;
import org.scijava.Prioritized;
import org.scijava.Priority;
import org.scijava.log.LogService;
import org.scijava.plugin.PluginInfo;
import org.scijava.plugin.PluginService;
import org.scijava.plugin.RichPlugin;

//import segmentationanalyzer.services.MetricService;

/*
 * Copyright (C) 2020 SciJava
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author Seth
 */
public class _SegmentationAnalyzer implements PlugIn, RichPlugin {
        public Context context;
    public double priority;
    
    public static void main(String[] args) {
         //set the plugins.dir property to make the plugin appear in the Plugins menu
        Class<?> clazz = _SegmentationAnalyzer.class;
        String url = clazz.getResource("/" + clazz.getName().replace('.', '/') + ".class").toString();
        String pluginsDir = url.substring(5, url.length() - clazz.getName().length() - 6);
        System.setProperty("plugins.dir", pluginsDir);

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {new ImageJ(); }
        });
    }
    //private Server sonicServer;


    @Override
    public void run(String str){
        
                //getUIValues();
        
                context = new Context( LogService.class, PluginService.class );
                priority = Priority.FIRST_PRIORITY;

                System.out.println("Starting up Segmentation Analyzer... ");
                System.out.println("-------------------------------- ");
                System.out.println("Available memory: " + getAvailableMemory()/(1000000000) + " GB");
                System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
                System.out.println("-------------------------------- ");
                System.out.println("Seting JVM configurations...");
                
                System.setProperty("java.util.Arrays.sort", "true");
                
                System.out.println("-------------------------------- ");
                System.out.println("Setting ImageJ configurations...");
                
                IJ.run("Options...", "iterations=1 count=1");

                
                
                    
    }

    @Override
    public Context context() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Context getContext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setContext(Context cntxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPriority() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPriority(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Prioritized o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PluginInfo<?> getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInfo(PluginInfo<?> pi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public static long getAvailableMemory(){
        
            long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            long freeMemory = Runtime.getRuntime().maxMemory() - usedMemory;
            
            return freeMemory;

    }
}
