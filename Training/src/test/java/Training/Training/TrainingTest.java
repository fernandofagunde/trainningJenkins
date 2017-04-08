package Training.Training;

import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class TrainingTest {
	
	DesiredCapabilities capacidade;
	 AndroidDriver driverAndroid;

	@Before
	public void setUp() throws Exception {
		
		File dirAplicativo = new File("c:\\TrianguloApp");
		File arqAplicativo = new File(dirAplicativo, "android-debug.apk");
		capacidade = new DesiredCapabilities();
		// definindo a plataforma que será testada.
		capacidade.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		// definindo o dispositivo que será testado.
		// capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "0018903858");
	   capacidade.setCapability("udid", "3300f86e4b43822b");
		//capacidade.setCapability("udid", "420005c6f25c7300");
		 capacidade.setCapability(MobileCapabilityType.DEVICE_NAME,"samsung");
		//capacidade.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Simulator");
		// definindo o aplicativo a ser testado.
		capacidade.setCapability(MobileCapabilityType.APP, arqAplicativo.getAbsolutePath());
		driverAndroid = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidade);
		

		// testing devops jenkis server 8/04/2017 11:33
	}

	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
		Thread.sleep(10000);
		driverAndroid.findElement(By.xpath("//android.widget.Button[@content-desc='menu ']")).click();
		Thread.sleep(5000);
	   //driverAndroid.findElement(By.xpath("//android.widget.Button[@content-desc='Consultar Serviço ']")).click();
	   driverAndroid.findElement(By.xpath("//*[@class='android.widget.Button' and @resource-id='button-menu-item2']")).click();
		
	}
	
	
	
//	public static void main(String[] args) throws MalformedURLException, InterruptedException{
	//}

}
