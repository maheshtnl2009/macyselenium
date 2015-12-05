package com.macycom;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class commonmethods extends sehelper {
	public String value;
	public String getdata(String getvalue) {

		try {
			File fXmlFile = new File(
					"C:/Users/mahesh/workspace/macy/testdata/testdata.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("countryname");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					if (eElement.getAttribute("id").contains("USA")) {
						value = eElement.getElementsByTagName(getvalue).item(0)
								.getTextContent();

					}
				}

			}

		} catch (Exception e) {

		}
		return value;
	}

	public static void Click(String locatorname, String locatorvalue) {
		if (locatorname.contains("id")) {
			driver.findElement(By.id(locatorvalue)).click();
		}
		if (locatorname.contains("name")) {
			driver.findElement(By.name(locatorvalue)).click();
		}
		if (locatorname.contains("xpath")) {
			driver.findElement(By.xpath(locatorvalue)).click();
		}
		if (locatorname.contains("cssSelector")) {
			driver.findElement(By.cssSelector(locatorvalue)).click();
		}
	}

	public static void entertext(String locatorname, String locatorvalue,
			String testdata) {
		if (locatorname.contains("id")) {
			driver.findElement(By.id(locatorvalue)).sendKeys(testdata);
		}
		if (locatorname.contains("name")) {
			driver.findElement(By.name(locatorvalue)).sendKeys(testdata);
		}
		if (locatorname.contains("xpath")) {
			driver.findElement(By.xpath(locatorvalue)).sendKeys(testdata);
		}
		if (locatorname.contains("cssSelector")) {
			driver.findElement(By.cssSelector(locatorvalue)).sendKeys(testdata);
		}

	}

	public static String Gettext(String locatorname, String locatorvalue) {
		String text = null;
		if (locatorname.contains("id")) {
			text = driver.findElement(By.id(locatorvalue)).getText();
		}
		if (locatorname.contains("name")) {
			text = driver.findElement(By.name(locatorvalue)).getText();
		}
		if (locatorname.contains("xpath")) {
			text = driver.findElement(By.xpath(locatorvalue)).getText();
		}
		if (locatorname.contains("cssSelector")) {
			text = driver.findElement(By.cssSelector(locatorvalue)).getText();
		}
		return text;

	}

	public static String Getattribute(String locatorname, String locatorvalue,
			String attribute) {

		String attributevalue = null;

		if (locatorname.contains("id")) {
			attributevalue = driver.findElement(By.id(locatorvalue))
					.getAttribute(attribute);
		} else if (locatorname.contains("name")) {
			attributevalue = driver.findElement(By.name(locatorvalue))
					.getAttribute(attribute);
		} else if (locatorname.contains("xpath")) {
			attributevalue = driver.findElement(By.xpath(locatorvalue))
					.getAttribute(attribute);
		} else if (locatorname.contains("css")) {
			attributevalue = driver.findElement(By.cssSelector(locatorvalue))
					.getAttribute(attribute);
		}

		return attributevalue;
	}

	public static void getalllinks(String linktext) {
		List<WebElement> linknames = driver.findElements(By.tagName("a"));
		for (int i = 0; i < linknames.size(); i++) {
			String linkname = linknames.get(i).getText();
			System.out.println(linkname);
			if (linkname.contains(linktext)) {
				 linknames.get(i).click();
				System.out.println("test case is passed");
				break;
			}
		}
	}

}
