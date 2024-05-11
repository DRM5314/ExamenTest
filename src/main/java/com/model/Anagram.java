package com.model;
public class Anagram {
    private String entry1;
    private String entry2;
    public Anagram(String entry1, String entry2){
        this.entry1 = entry1;
        this.entry2 = entry2;
    }

    public boolean isAnagram(){
        boolean returns = true;
        if(!this.isValidEntry())return false;

        int chartesEntry1 = this.sumCharter(this.entry1);
        int chartesEntry2 = this.sumCharter(this.entry2);

        if(chartesEntry1 != chartesEntry2){
            System.out.println("This entry is NOT Anagram: "+this.entry1+" - -"+this.entry2);
            return false;
        }
        System.out.println("This entry is Anagram!!!: "+this.entry1+" - -"+this.entry2);
        return true;
    }

    private int sumCharter(String entry){
        char entrys [] = entry.toCharArray();
        int returns = 0;
        for(int charEntry : entrys){
            returns += charEntry;
        }
        return returns;
    }

    private boolean isValidEntry(){
        if(this.entry1.length() != this.entry2.length()){
            System.out.println("Entry is not Anagram, are not equal length");
            return false;
        }

        if(this.entry1.isBlank() || this.entry2.isBlank()){
            System.out.println("Entry is not Anagram, are not text entry");
            return false;
        }
        return true;
    }

}
