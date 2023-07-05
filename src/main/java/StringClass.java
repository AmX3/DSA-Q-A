public class StringClass {

    public static void numberOfSeniorCitizens(String[] details) {
        int count = 0;

        for(int i = 0; i < details.length; i++) {
            int age = Integer.parseInt(details[i].substring(11, 13));
            System.out.println(age);
            if (age > 60) {
                count++;
            }
        }
        System.out.println(count);
    }
}
