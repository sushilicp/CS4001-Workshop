public class AdmissionProcessor {

    public static String formatName(String rawName)
    {
        String trmName = rawName.trim();
        String smallName = trmName.toLowerCase();
        String[] nameParts = smallName.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String part : nameParts) {
            if (part.length() > 0) {
                sb.append(Character.toUpperCase(part.charAt(0)));
                sb.append(part.substring(1));
                sb.append(" ");
            }
        }
       return sb.toString().trim(); 
    }

    public static void main(String[] args) {
        String name =formatName("bAHADUR Gurung ");
        System.out.println("=======Admission Report========\n");
        System.out.println(String.format("Name: %s",name));
    }
}
