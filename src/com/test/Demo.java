package com.test;
	 
	import java.util.concurrent.TimeUnit;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	public class Demo {
	    public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\edz\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");//chromedriver�����ַ
	        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ��󣬵���new ����FirefoxDriver������
	        driver.get("http://www.baidu.com");//��ָ������վ
	        Thread.sleep(5000);
	        driver.findElement(By.id("kw")).sendKeys("hello");
//	        driver.findElement(By.id("kw")).sendKeys(new  String[] {"hello"});//�ҵ�kwԪ�ص�id��Ȼ������hello
	        Thread.sleep(3000);
	        driver.findElement(By.id("su")).click(); //�����Ť
	        Thread.sleep(3000);
	        try {
	            /**
	             * WebDriver�Դ���һ�����ܵȴ��ķ�����
	            dr.manage().timeouts().implicitlyWait(arg0, arg1����
	            Arg0���ȴ���ʱ�䳤�ȣ�int ���� ��
	            Arg1���ȴ�ʱ��ĵ�λ TimeUnit.SECONDS һ��������Ϊ��λ��
	             */
	            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);        
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        /**
	         * dr.quit()��dr.close()�������˳������,�򵥵�˵һ�����ߵ����𣺵�һ��close��
	         * ������˶��ҳ���ǹز��ɾ��ģ���ֻ�رյ�ǰ��һ��ҳ�档�ڶ���quit��
	         * ���˳�������Webdriver���еĴ��ڣ��˵ķǳ��ɾ��������Ƽ�ʹ��quit��Ϊһ��case�˳��ķ�����
	         */
	        driver.quit();//�˳������
	    }
	}

