package Solutions;

import javax.swing.*;

public class Business_Letter 
{
    public static void main(String[] args) 
    {
        // Declare variables to hold the customer's name and parsed parts
        String name;
        String firstName = "";
        String familyName = "";
        int x;

        // Get the input from the user using a dialog box
        name = JOptionPane.showInputDialog(null, "Please enter customer's first and last name: ");

        // Initialize the index for parsing the name
        x = 0;

        // Loop to find the first space in the input string
        while (x < name.length() && name.charAt(x) != ' ') 
        {
            x++;
        }

        // Check if a space was found
        if (x < name.length()) 
        {
            // Extract the first name using substring
            firstName = name.substring(0, x);
            // Extract the last name using substring from the character after the space
            familyName = name.substring(x + 1);
        } 
        else 
        {
            // Handle the case where no space is found (i.e., only one name is provided)
            firstName = name;
        }

        // Display the formatted business letter in a dialog box
        JOptionPane.showMessageDialog(null, 
            "Dear " + firstName + " " + familyName + ",\n\n" +
            "We are pleased to inform you about our new business initiative.\n" +
            "We value your patronage and look forward to continuing our relationship.\n\n" +
            "Sincerely,\nThe Business Team");
    }
}
