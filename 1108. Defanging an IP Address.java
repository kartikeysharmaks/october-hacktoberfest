class Solution {
    public String defangIPaddr(String address) {
        String newString = address.replace(".","[.]");
        return newString;
    }
}
