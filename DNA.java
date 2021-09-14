/*
This is a DNA sequencing program that determines 
whether there is a protein in a strand of DNA.
*/


public class DNA {
       

  public static void main(String[] args) {     
         
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    
    
    // DNA strands to test program
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    // Create generic variable that can be set to any DNA sequence to process
    String dna = dna1;

    // Find the length:
    int length = dna.length();
    System.out.println("Length: " + length);

    // Find start codon ATG: 
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

    // Find stop codon TGA:
    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " + stop);

    // Find the protein:
    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {


      String protein = dna.substring(start, stop+3);
      System.out.println("Protein: " + protein);

    } else {
              
     System.out.println("No protein.");

        }

      }
 
    }
