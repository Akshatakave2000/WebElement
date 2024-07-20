1) isSelected() command
This command only works on input elements such as radio buttons, checkboxes, select options, and menu items. It is used to determine if an element is selected.
If the specified element is selected, the value returned is true. If not, the value returned is false.
Syntax:
element.isSelected();
Code:
WebElement redioButtonGenderFemale = driver.findElement(By.xpath("//input[@id='Female']"));
		if(redioButtonGenderFemale.isSelected()) {
		}else
  {
	 redioButtonGenderFemale.click();
	}

2) isDisplayed() command
The isDisplayed command in Selenium verifies if a particular element is present and displayed. If the element is displayed, then the value returned is true.
If not, then the value returned is a NoSuchElementFound exception.
Syntax:
element.isDisplayed();
The code below verifies if an element with the id attribute value next is displayed.
boolean eleSelected= driver.findElement(By.xpath("xpath")).isDisplayed();
code:
WebElement textBoxMobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		System.out.println(textBoxMobile.isDisplayed());
		if(textBoxMobile.isDisplayed()) {
		   textBoxMobile.sendKeys("9033761269");
    }
   
3) isEnabled() command
This WebElement in Selenium command verifies if an element is enabled on the web page. If the element is enabled, it returns a true value. If not, it returns a false value.
Syntax:
element.isEnabled();
The code below verifies if an element with the id attribute value next is enabled.
boolean eleEnabled= driver.findElement(By.xpath(“xpath”)).isEnabled();
Code:
WebElement textBoxEmail = driver.findElement(By.xpath("//input[@id='email']"));
		if(textBoxEmail.isEnabled()) {
			textBoxEmail.sendKeys("Akshata@gamil.com");
     }
   
4) clear( ) command
When using this WebElement in Selenium command, its value will be cleared if the element in question is a text entry. It doesn’t require a parameter and returns nothing.
Syntax:
element.clear();
The clear() method does not affect other web elements. The text entry elements here are INPUT and TEXTAREA.
Code:
WebElement textBoxUsername = driver.findElement(By.xpath("//input[@id='username']"));
		textBoxUsername.sendKeys("Akshata");
		Thread.sleep(5000);
		textBoxUsername.clear();

5) getTagName() command
This method retrieves the tag name of the specified element. It does not require a parameter and returns a string value as its result.
Syntax:
element.getTagName();
This command does not return the value of the name attribute. It returns the tag. For example, if the code is <input name=”foo”/>, then this command will return the tag,
i.e. “input”.
Code:String tagname = textBoxUsername.getTagName();
		System.out.println("Value of tagname is :"+tagname);

6) getAttribute() command
This command retrieves the attribute value of a specified element. It uses String as the parameter and returns a string value as its result.
Syntax:
element.getAttribute();
Code:
String  attribute = textBoxUsername.getAttribute("placeholder");
		System.out.println("Value of placeholder attribute is :"+attribute);

