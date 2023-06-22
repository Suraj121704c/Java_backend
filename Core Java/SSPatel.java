public class SSPatel {
    public static String convertName (String fullName){
        String[] nameParts = fullName.split(" ");
        if(nameParts.length == 3){
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            String convertedName = firstName.charAt(0) + "." + middleName.charAt(0) + "." + lastName;

            return convertedName;
        }else {
            return fullName;
        }
    }

    public static void main(String[] args) {
        String fullName = "Suraj Singh Patel";
        String convertName = convertName(fullName);
        System.out.println(convertName);
    }
}
