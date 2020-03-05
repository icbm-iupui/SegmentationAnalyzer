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
package segmentationanalyzer.loaders;


import io.scif.config.SCIFIOConfig;
import io.scif.config.SCIFIOConfig.ImgMode;
import io.scif.img.ImgIOException;

import io.scif.img.ImgOpener;
 
import java.io.File;

 
import net.imglib2.img.Img;
import net.imglib2.img.display.imagej.ImageJFunctions;
import net.imglib2.type.NativeType;
import net.imglib2.type.numeric.RealType;

/**
 *
 * @author Seth
 * @param <T>
 */

        
public class loadImage{
    
    public <T extends RealType<T> & NativeType<T>> loadImage(String arg)
            throws ImgIOException
    {
        
    //Add code to get path
        
        File file = new File( arg );
        String path = file.getAbsolutePath();
 
        // create the ImgOpener
        ImgOpener imgOpener = new ImgOpener();

   
                Img<T> image = (Img<T>)imgOpener.openImgs(path).get(0);
  
    

      

 
 
       ImageJFunctions.show(image);
 

        SCIFIOConfig config = new SCIFIOConfig();

        config.imgOpenerSetImgModes( ImgMode.CELL );
 
      
        Img< T > imageCell = ( Img< T > ) imgOpener.openImgs( path, config ).get( 0 );
 

        ImageJFunctions.show( imageCell );
}
}
