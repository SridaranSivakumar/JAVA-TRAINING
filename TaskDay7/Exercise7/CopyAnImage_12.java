package Exercise7;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CopyAnImage_12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedImage inputImage = ImageIO.read(new File("/Users/sridaransivakumar/Desktop/Demo/InputImage.jpg"));
			ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
			ImageIO.write(inputImage, "jpg", byteOutputStream);
			byte[] imageData = byteOutputStream.toByteArray();
			ByteArrayInputStream byteInputStream = new ByteArrayInputStream(imageData);
			BufferedImage outputImage = ImageIO.read(byteInputStream);
			ImageIO.write(outputImage, "jpg", new File("/Users/sridaransivakumar/Desktop/Demo/outputImage.jpg"));
			System.out.println("Output image created");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
