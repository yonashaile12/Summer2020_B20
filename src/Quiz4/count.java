package Quiz4;

public class count {

    public static int countYZ(String str) {
        if(str.length() == 0)
            return 0;

        int count = 0;

        for(int i = 0; i <= str.length() - 2; i++) {
            if((Character.toLowerCase(str.charAt(i)) == 'y' ||
                    Character.toLowerCase(str.charAt(i)) == 'z') &&
                    !Character.isLetter(str.charAt(i+1)))
                count++;
        }

        if(Character.toLowerCase(str.charAt(str.length() - 1)) == 'y' ||
                Character.toLowerCase(str.charAt(str.length() - 1)) == 'z')
            count++;

        return count;
    }

    public static void main(String[] args) {
        String str = "!!day--yaz!!";

        count ct = new count();
        System.out.println(ct.countYZ(str));

        System.out.println(ct.withoutString("Hello there", "llo"));

        System.out.println(ct.equalIsNot("noisxxnotyynotxsi"));
    }


    public String withoutString(String base, String remove) {
        char[] arr = new char[base.length()];
        int count = 0;
        int i = 0;

        while(i <= base.length() - remove.length()) {
            if(base.substring(i, i + remove.length()).toLowerCase().equals(
                    remove.toLowerCase())) {
                i += remove.length();
            } else {
                arr[count] = base.charAt(i);
                count++;
                i++;
            }
        }

        while(i < base.length()) {
            arr[count] = base.charAt(i);
            count++;
            i++;
        }

        return new String(arr, 0, count);
    }


    public boolean equalIsNot(String str) {

        for(int i = 0; i < str.length(); i++){
            if(str.substring(i).equals("is") == str.substring(i).equals("not") ){
                return true;
            }
        }
        return false;

    }

    public String sameEnds(String string) {


        int start = (int) Math.ceil((double) string.length() / 2);
        int end = string.length() / 2;

        for(int i = 0; i < string.length() / 2; i++) {
            if(string.substring(0, end).equals(string.substring(start))) {
                return string.substring(0, end);
            } else {
                start++;
                end--;
            }
        }

        return "";
    }

}
