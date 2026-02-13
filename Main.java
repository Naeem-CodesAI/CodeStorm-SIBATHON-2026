import java.util.Scanner;
import java.io.*;

class Doctor {
    String name, city, specialty, phone;

    Doctor(String name, String city, String specialty, String phone) {
        this.name = name;
        this.city = city;
        this.specialty = specialty;
        this.phone = phone;
    }

    void display() {
        System.out.println("Doctor: " + name);
        System.out.println("City: " + city);
        System.out.println("Specialty: " + specialty);
        System.out.println("Phone: " + phone);
        System.out.println("---------------------------");
    }
}

public class Main {
    static final String PATIENT_FILE = "patients.txt";
    static final String DOCTOR_FILE = "doctors.txt";

    static void viewDoctors(Scanner sc) {

        System.out.print("Enter your name: ");
        String patientName = sc.nextLine();

        System.out.print("Enter your city: ");
        String patientCity = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String patientPhone = sc.nextLine();

        System.out.println("\nWelcome, " + patientName + "!");
        System.out.println("Your city: " + patientCity);
        System.out.println("Your phone: " + patientPhone);
        System.out.println("\nDoctors available in your city:");
        System.out.println("===============================");

        // Save patient to file
        try {
            FileWriter fw = new FileWriter(PATIENT_FILE, true); // append mode
            fw.write(patientName + "|" + patientCity + "|" + patientPhone + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: Patient data not saved.");
        }

        // Doctors (hardcoded objects)
        Doctor d1 = new Doctor("Dr Ali Raza", "Karachi", "Cardiologist", "0300-1111111");
        Doctor d2 = new Doctor("Dr Sara Khan", "Karachi", "Dermatologist", "0301-1111112");
        Doctor d3 = new Doctor("Dr Hamza Siddiqui", "Karachi", "Neurologist", "0302-1111113");
        Doctor d4 = new Doctor("Dr Ayesha Malik", "Karachi", "Gynaecologist", "0303-1111114");
        Doctor d5 = new Doctor("Dr Fahad Iqbal", "Karachi", "Orthopedic", "0304-1111115");
        Doctor d6 = new Doctor("Dr Laraib Shaikh", "Sukkur", "Surgeon", "0310-2222221");
        Doctor d7 = new Doctor("Dr Zarain Memon", "Sukkur", "Child Specialist", "0311-2222222");
        Doctor d8 = new Doctor("Dr Saqlain Abbasi", "Sukkur", "Emergency", "0312-2222223");
        Doctor d9 = new Doctor("Dr Paras Ansari", "Sukkur", "Gynaecologist", "0313-2222224");
        Doctor d10 = new Doctor("Dr Zaviyar Soomro", "Sukkur", "Cardiologist", "0314-2222225");
        Doctor d11 = new Doctor("Dr Bilal Hussain", "Hyderabad", "Dermatologist", "0320-3333331");
        Doctor d12 = new Doctor("Dr Hira Qureshi", "Hyderabad", "Dentist", "0321-3333332");
        Doctor d13 = new Doctor("Dr Ahmed Rind", "Hyderabad", "ENT Specialist", "0322-3333333");
        Doctor d14 = new Doctor("Dr Mahnoor Shah", "Hyderabad", "Pediatrician", "0323-3333334");
        Doctor d15 = new Doctor("Dr Danish Pathan", "Hyderabad", "Surgeon", "0324-3333335");
        Doctor d16 = new Doctor("Dr Usman Tariq", "Lahore", "Cardiologist", "0330-4444441");
        Doctor d17 = new Doctor("Dr Nimra Ashraf", "Lahore", "Gynaecologist", "0331-4444442");
        Doctor d18 = new Doctor("Dr Talha Sheikh", "Lahore", "Orthopedic", "0332-4444443");
        Doctor d19 = new Doctor("Dr Areeba Latif", "Lahore", "Neurologist", "0333-4444444");
        Doctor d20 = new Doctor("Dr Zainab Arshad", "Lahore", "Dermatologist", "0334-4444445");
        Doctor d21 = new Doctor("Dr Farhan Ali", "Islamabad", "Cardiologist", "0340-5555551");
        Doctor d22 = new Doctor("Dr Sana Rehman", "Islamabad", "Dentist", "0341-5555552");
        Doctor d23 = new Doctor("Dr Waqas Mirza", "Islamabad", "ENT Specialist", "0342-5555553");
        Doctor d24 = new Doctor("Dr Iqra Naveed", "Islamabad", "Pediatrician", "0343-5555554");
        Doctor d25 = new Doctor("Dr Shahzaib Khan", "Islamabad", "Surgeon", "0344-5555555");
        Doctor d26 = new Doctor("Dr Aiman Baloch", "Karachi", "Child Specialist", "0305-1111116");
        Doctor d27 = new Doctor("Dr Haris Memon", "Sukkur", "Orthopedic", "0315-2222226");
        Doctor d28 = new Doctor("Dr Laiba Ahmed", "Hyderabad", "Cardiologist", "0325-3333336");
        Doctor d29 = new Doctor("Dr Omar Khalid", "Lahore", "Dentist", "0335-4444446");
        Doctor d30 = new Doctor("Dr Mariam Yousuf", "Islamabad", "Gynaecologist", "0345-5555556");

        // Save doctors into file (overwrites file each run)
        try {
            FileWriter fw = new FileWriter(DOCTOR_FILE);

            fw.write(d1.name + "|" + d1.city + "|" + d1.specialty + "|" + d1.phone + "\n");
            fw.write(d2.name + "|" + d2.city + "|" + d2.specialty + "|" + d2.phone + "\n");
            fw.write(d3.name + "|" + d3.city + "|" + d3.specialty + "|" + d3.phone + "\n");
            fw.write(d4.name + "|" + d4.city + "|" + d4.specialty + "|" + d4.phone + "\n");
            fw.write(d5.name + "|" + d5.city + "|" + d5.specialty + "|" + d5.phone + "\n");
            fw.write(d6.name + "|" + d6.city + "|" + d6.specialty + "|" + d6.phone + "\n");
            fw.write(d7.name + "|" + d7.city + "|" + d7.specialty + "|" + d7.phone + "\n");
            fw.write(d8.name + "|" + d8.city + "|" + d8.specialty + "|" + d8.phone + "\n");
            fw.write(d9.name + "|" + d9.city + "|" + d9.specialty + "|" + d9.phone + "\n");
            fw.write(d10.name + "|" + d10.city + "|" + d10.specialty + "|" + d10.phone + "\n");
            fw.write(d11.name + "|" + d11.city + "|" + d11.specialty + "|" + d11.phone + "\n");
            fw.write(d12.name + "|" + d12.city + "|" + d12.specialty + "|" + d12.phone + "\n");
            fw.write(d13.name + "|" + d13.city + "|" + d13.specialty + "|" + d13.phone + "\n");
            fw.write(d14.name + "|" + d14.city + "|" + d14.specialty + "|" + d14.phone + "\n");
            fw.write(d15.name + "|" + d15.city + "|" + d15.specialty + "|" + d15.phone + "\n");
            fw.write(d16.name + "|" + d16.city + "|" + d16.specialty + "|" + d16.phone + "\n");
            fw.write(d17.name + "|" + d17.city + "|" + d17.specialty + "|" + d17.phone + "\n");
            fw.write(d18.name + "|" + d18.city + "|" + d18.specialty + "|" + d18.phone + "\n");
            fw.write(d19.name + "|" + d19.city + "|" + d19.specialty + "|" + d19.phone + "\n");
            fw.write(d20.name + "|" + d20.city + "|" + d20.specialty + "|" + d20.phone + "\n");
            fw.write(d21.name + "|" + d21.city + "|" + d21.specialty + "|" + d21.phone + "\n");
            fw.write(d22.name + "|" + d22.city + "|" + d22.specialty + "|" + d22.phone + "\n");
            fw.write(d23.name + "|" + d23.city + "|" + d23.specialty + "|" + d23.phone + "\n");
            fw.write(d24.name + "|" + d24.city + "|" + d24.specialty + "|" + d24.phone + "\n");
            fw.write(d25.name + "|" + d25.city + "|" + d25.specialty + "|" + d25.phone + "\n");
            fw.write(d26.name + "|" + d26.city + "|" + d26.specialty + "|" + d26.phone + "\n");
            fw.write(d27.name + "|" + d27.city + "|" + d27.specialty + "|" + d27.phone + "\n");
            fw.write(d28.name + "|" + d28.city + "|" + d28.specialty + "|" + d28.phone + "\n");
            fw.write(d29.name + "|" + d29.city + "|" + d29.specialty + "|" + d29.phone + "\n");
            fw.write(d30.name + "|" + d30.city + "|" + d30.specialty + "|" + d30.phone + "\n");

            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing doctors file.");
        }

        // Read doctors from file and show only matching city
        boolean found = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader(DOCTOR_FILE));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data.length == 4 && data[1].equalsIgnoreCase(patientCity)) {
                    System.out.println("Doctor: " + data[0]);
                    System.out.println("City: " + data[1]);
                    System.out.println("Specialty: " + data[2]);
                    System.out.println("Phone: " + data[3]);
                    System.out.println("---------------------------");
                    found = true;
                }
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error reading doctors file.");
        }

        if (!found) {
            System.out.println("Sorry! No doctors found in " + patientCity + ".");
        }
    } // ✅ closes viewDoctors properly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) View Doctors");
        System.out.print("Choose option: ");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            viewDoctors(sc);
        } else {
            System.out.println("Invalid option.");
        }

        sc.close();
    }
}
