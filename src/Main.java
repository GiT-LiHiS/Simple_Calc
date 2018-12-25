

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.*;
import java.text.DecimalFormat;
public class Main extends Application {
	//numbes, strings and booleans
	static String math ;
	static double number1 = 0;
	static double number2 = 0;
	static String answer;
	static TextField text = new TextField();
	static int clickercounter = 0;
	static boolean clicked = false;
	static boolean theme = true;

	//mathbuttons
	static Button plusbutton = new Button("+");
	static Button minusbutton = new Button("-");
	static Button dividebutton = new Button("/");
	static Button multiplybutton = new Button("*");
	static Button buttondecimal = new Button(",");
	static Button buttonbackspace = new Button("⌫");
	static Button equalsbutton = new Button("=");
	static Button buttontheme = new Button("THEME");
	 //Number buttons
	static Button button1 = new Button("1");
	static Button button2 = new Button("2");
	static Button button3 = new Button("3");
	static Button button4 = new Button("4");
	static Button button5 = new Button("5");
	static Button button6 = new Button("6");
	static Button button7 = new Button("7");
	static Button button8 = new Button("8");
	static Button button9 = new Button("9");
	static Button button0 = new Button("0");
	static Button clearbutton = new Button("C");
	//layout
	static HBox fieldbox = new HBox();
	static BorderPane borderpane = new BorderPane();
	static VBox layout = new VBox(10);
	static GridPane grid = new GridPane();
	static Scene scene = new Scene(borderpane,300,450);

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage window) throws Exception {
		//
		window.setTitle("Calculator by LihiS");
		scene.getStylesheets().add(getClass().getResource("light.css").toExternalForm());
		
		grid.setPadding(new Insets(20,20,20,20));
		
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setAlignment(Pos.TOP_CENTER);
		
		
			text.setPrefWidth(260);
			text.setPrefHeight(50);
			text.setEditable(false);
		
	
			//number buttons
							buttonbackspace.setPrefWidth(60);
							buttonbackspace.setPrefHeight(60);
							buttonbackspace.setId("buttonback");
							buttonbackspace.setOnAction(e ->{
				
									backSpace();

							});
								
							buttondecimal.setPrefWidth(60);
							buttondecimal.setPrefHeight(60);
							buttondecimal.setOnAction(e ->{
								String textField = text.getText() + ".";
								text.setText(textField);

							});
	
							button1.setPrefWidth(60);
							button1.setPrefHeight(60);
							button1.setOnAction(e ->{
								String textField = text.getText() + "1";
							    text.setText(textField);
								
								
							
							});
					
		
							button2.setPrefWidth(60);
							button2.setPrefHeight(60);
							button2.setOnAction(e ->{
								
								String textField = text.getText() + "2";
							    text.setText(textField);
								

							});
		
							button3.setPrefWidth(60);
							button3.setPrefHeight(60);
							button3.setOnAction(e ->{
								String textField = text.getText() + "3";
							    text.setText(textField);
								

							});
							
			
					 		button4.setPrefWidth(60);
					        button4.setPrefHeight(60);
					  		button4.setOnAction(e ->{
					  			String textField = text.getText() + "4";
							    text.setText(textField);
								

							});
					  		
			
					 		button5.setPrefWidth(60);
					        button5.setPrefHeight(60);
					  		button5.setOnAction(e ->{
					  			String textField = text.getText() + "5";
							    text.setText(textField);
								

							});
					  		
			
					 		button6.setPrefWidth(60);
					        button6.setPrefHeight(60);			
					  		button6.setOnAction(e ->{
					  			String textField = text.getText() + "6";
							    text.setText(textField);
								

							});
	    	
					 		button7.setPrefWidth(60);
					        button7.setPrefHeight(60);					     
					  		button7.setOnAction(e ->{
					  			String textField = text.getText() + "7";
							    text.setText(textField);
								

							});
					  		
			
					 		button8.setPrefWidth(60);
					        button8.setPrefHeight(60);					     
					  		button8.setOnAction(e ->{
					  			String textField = text.getText() + "8";
							    text.setText(textField);
								

							});
					  		
			
					 		button9.setPrefWidth(60);
					        button9.setPrefHeight(60);				     
					  		button9.setOnAction(e ->{
					  			
					  			String textField = text.getText() + "9";
							    text.setText(textField);
								

							});
		    
					 		button0.setPrefWidth(60);
					        button0.setPrefHeight(60);				     	
					  		button0.setOnAction(e ->{
					  			String textField = text.getText() + "0";
							    text.setText(textField);
								

							});

			//math buttons
	
					  		multiplybutton.setPrefWidth(60);
					  		multiplybutton.setPrefHeight(60);					 
					  		multiplybutton.setOnAction(e ->{
							
					  			mathMultiply();
								
												
							});		
					  		

					  	
					  		dividebutton.setPrefWidth(60);
					  		dividebutton.setPrefHeight(60);	  		
					  		dividebutton.setOnAction(e ->{
							

					  				mathDivide();
								
												
							});			  		
					  		
				  		
					  		 
	
					  		plusbutton.setPrefWidth(60);
					  		plusbutton.setPrefHeight(60);
					  		plusbutton.setOnAction(e ->{
					  			mathPlus();
					
									
				});
		
	
				minusbutton.setPrefWidth(60);
				minusbutton.setPrefHeight(60);		
				minusbutton.setOnAction(e ->{
						
					
					mathMinus();
				
						
		
					
	
				});
				

		  	//clear button resets variables and booleans	
		  		clearbutton.setPrefWidth(60);
		  		clearbutton.setPrefHeight(60);	  		
		  		clearbutton.setOnAction(e ->{
				  			
		  			plusbutton.setDisable(false);
					minusbutton.setDisable(false);
					dividebutton.setDisable(false);
					multiplybutton.setDisable(false);			
					
					clicked = false;			
					disablebuttons();
						
		         number1 = 0;
		  		 number2 = 0;
		  		
		  		 
		  		 text.setText("");
		  		 text.setPromptText("");
			
									
				});			  		

				equalsbutton.setPrefWidth(60);
				equalsbutton.setPrefHeight(60);
				equalsbutton.setOnAction(e ->{
				
					 mathEquals();
					
					
				});
				
				//theme button
				
				buttontheme.setPrefWidth(60);
				buttontheme.setPrefHeight(60);
				buttontheme.setId("buttontheme");
				buttontheme.setOnAction(e ->{
				
				//load stylesheet based on boolean value	
				
					theme ^= true;
					
					if (!theme) {
						scene.getStylesheets().remove(getClass().getResource("light.css").toExternalForm());
						scene.getStylesheets().add(getClass().getResource("dark.css").toExternalForm());
						System.out.println("asdsad");
						
					}
					
					if (theme) {
						scene.getStylesheets().remove(getClass().getResource("dark.css").toExternalForm());
						scene.getStylesheets().add(getClass().getResource("light.css").toExternalForm());
						System.out.println("dsads");
						
					}
					
					System.out.println(theme);
					
					
				});
		
		// place buttons to gridpane
				
		GridPane.setConstraints(button7, 0, 0);
		GridPane.setConstraints(button8, 1, 0);
		GridPane.setConstraints(button9, 2, 0);
		GridPane.setConstraints(multiplybutton, 3, 0);
		
		GridPane.setConstraints(button4, 0, 1);
		GridPane.setConstraints(button5, 1, 1);
		GridPane.setConstraints(button6, 2, 1);
		GridPane.setConstraints(minusbutton, 3, 1);
		
		GridPane.setConstraints(button1, 0, 2);
		GridPane.setConstraints(button2, 1, 2);
		GridPane.setConstraints(button3, 2, 2);
		GridPane.setConstraints(plusbutton, 3, 2);
		
		GridPane.setConstraints(clearbutton, 0, 3);
		GridPane.setConstraints(button0, 1, 3);
		GridPane.setConstraints(dividebutton, 2, 3);
		GridPane.setConstraints(equalsbutton, 3, 3);
		
		
		GridPane.setConstraints(buttondecimal, 0, 4);
		GridPane.setConstraints(buttonbackspace, 1, 4);
		GridPane.setConstraints(buttontheme, 2, 4);
		
		
		
		//add elementes to gridpane
		
		grid.getChildren().addAll(button7,button8,button9,multiplybutton,button4,button5,
				button6,minusbutton,button1,button2,button3,plusbutton,clearbutton,
				button0,dividebutton,equalsbutton,
				buttondecimal,buttonbackspace,buttontheme);
		
		//setting layouts to borderpane
		
				fieldbox.getChildren().add(text);
				fieldbox.setAlignment(Pos.CENTER);
				fieldbox.setPadding(new Insets(5,5,5,5));
				fieldbox.setStyle("-fx-padding: 20 0 0 0;");

				borderpane.setTop(fieldbox);
				borderpane.setCenter(grid);
				
		
		layout.setPadding(new Insets(5,5,5,5));
		
		
		
		window.setScene(scene);
		window.show();
		
	}
	//math methods:
	//first number value is stored in "number1" variable, "math" variable is set to corresponding string value,
	// disabling math buttons based on clickercounter, could be done also with boolean
	//setting "clicked" boolean to false, disablebutton method disables number buttons based on that value
	//throws NumberFormatException if pressed when the textfield is empty
	
	public static void mathPlus() {
		
		try {
			
				
				number1 = Double.parseDouble(text.getText());
				math = "+";
				text.setPromptText(text.getText());
				text.setText("");
				clickercounter++;
				
				if (clickercounter > 0) {
					
					plusbutton.setDisable(true);
					minusbutton.setDisable(true);
					dividebutton.setDisable(true);
					multiplybutton.setDisable(true);
					
				}
		
		}
		
		
		catch(NumberFormatException e) {
			
			System.out.println("NumberFormatException in mathPlus");
			
			
		}
		
		
		clicked = false;
		
		disablebuttons();
		
	}
	
	public static void mathMinus() {
		
		try {
		
				System.out.println(text.getText());
				
				number1 = Double.parseDouble(text.getText());
				math = "-";
				text.setPromptText(text.getText());
				text.setText("");
				
				clickercounter++;
				

				if (clickercounter > 0) {
					
					plusbutton.setDisable(true);
					minusbutton.setDisable(true);
					dividebutton.setDisable(true);
					multiplybutton.setDisable(true);
					
				}
				
	
			}

		
		catch(NumberFormatException e) {
			
			System.out.println("NumberFormatException in mathMinus");
			
			
		}
		
		clicked = false;
		
		disablebuttons();
		
	}
		

public static void mathMultiply() {
		
		try {
			
				System.out.println(text.getText());
				number1 = Double.parseDouble(text.getText());
				math = "*";
				text.setPromptText(text.getText());
				text.setText("");
				clickercounter++;
				
				if (clickercounter > 0) {
					
					plusbutton.setDisable(true);
					minusbutton.setDisable(true);
					dividebutton.setDisable(true);
					multiplybutton.setDisable(true);
					
				}
		
		}
		
		
		catch(NumberFormatException e) {
			
			System.out.println("NumberFormatException in mathMultiply");
		
		}
	
		clicked = false;
		
		disablebuttons();
		
	}


public static void mathDivide() {
	
	try {
		
			System.out.println(text.getText());
			number1 = Double.parseDouble(text.getText());
			math = "/";
			text.setPromptText(text.getText());
			text.setText("");
			clickercounter++;
			
			if (clickercounter > 0) {
				
				plusbutton.setDisable(true);
				minusbutton.setDisable(true);
				dividebutton.setDisable(true);
				multiplybutton.setDisable(true);
				
			}
	
	}
	
	
	catch(NumberFormatException e) {
		
		System.out.println("NumberFormatException in mathDivide");

		
	}

	clicked = false;
	
	disablebuttons();
	
}
	
	//equalsbutton:
	//calculates based on "math" variable
	//second number stored on "number2" variable
	//enables mathbuttons
	//setting "clicked" boolean to true, disablebutton method disables number buttons based on that value
	//throws NullPointerException if "number1" variable is null
	//throws NumberFormatException if "number2" variable is null

		public static void mathEquals() {
			
			try {
			
				
				if (math.equals("+")) {
					
					number2 = Double.parseDouble(text.getText());
					answer = String.valueOf(number1 + number2);
					text.setText(answer);
					number1 = Double.parseDouble(answer);
					plusbutton.setDisable(false);
					minusbutton.setDisable(false);
					dividebutton.setDisable(false);
					multiplybutton.setDisable(false);
					
				}
				
				
				if (math.equals("-") ) {
					
					number2 = Double.parseDouble(text.getText());
					answer = String.valueOf(number1 - number2);
					text.setText(answer);
					number1 = Double.parseDouble(answer);
					System.out.println("vaihto ehto 3");
					plusbutton.setDisable(false);
					minusbutton.setDisable(false);
					dividebutton.setDisable(false);
					multiplybutton.setDisable(false);
	
					
				}
				
	               if (math.equals("*") ) {
					
					number2 = Double.parseDouble(text.getText());
					answer = String.valueOf(number1 * number2);
					text.setText(answer);
					number1 = Double.parseDouble(answer);
					System.out.println("vaihto ehto 3");
					plusbutton.setDisable(false);
					minusbutton.setDisable(false);
					dividebutton.setDisable(false);
					multiplybutton.setDisable(false);
					
					
				}
	               
	               if (math.equals("/") ) {
						
						number2 = Double.parseDouble(text.getText());
						answer = String.valueOf(number1 / number2);
						text.setText(answer);
						number1 = Double.parseDouble(answer);
						System.out.println("vaihto ehto 3");
						plusbutton.setDisable(false);
						minusbutton.setDisable(false);
						dividebutton.setDisable(false);
						multiplybutton.setDisable(false);

					}
				
				clicked = true;
				disablebuttons();

				}

			catch(NullPointerException e) {
				
				System.out.println("NullPointerException in equalbutton");
	
			}
            catch(NumberFormatException e) {
				
				System.out.println("NumberFormatException in eqlualbutton");

			}
	}
		
		//disables mathbuttons
		public static void disablebuttons() {
			
			if (clicked) {
				
				button1.setDisable(true);
				button2.setDisable(true);
				button3.setDisable(true);
				button4.setDisable(true);
				button5.setDisable(true);
				button6.setDisable(true);
				button7.setDisable(true);
				button8.setDisable(true);
				button9.setDisable(true);
				button0.setDisable(true);
				buttondecimal.setDisable(true);
				buttonbackspace.setDisable(true);
				
				
			}
			
			if (!clicked) {
				
				button1.setDisable(false);
				button2.setDisable(false);
				button3.setDisable(false);
				button4.setDisable(false);
				button5.setDisable(false);
				button6.setDisable(false);
				button7.setDisable(false);
				button8.setDisable(false);
				button9.setDisable(false);
				button0.setDisable(false);
				buttondecimal.setDisable(false);
				buttonbackspace.setDisable(false);

			}
		}
		
		
		//deletes last char from string
		//throws StringIndexOutOfBoundsException if trying to delete from empty string
		public static void backSpace() {
			
	
			try {
				String str = text.getText();
				str = str.substring(0, str.length() - 1);
				text.setText(str);

			}


		
		catch(StringIndexOutOfBoundsException e) {
			
			System.out.print("StringIndexOutOfBoundsException");
	
			
		}	
			
		}
		
		
	
		
		
		
	

}
