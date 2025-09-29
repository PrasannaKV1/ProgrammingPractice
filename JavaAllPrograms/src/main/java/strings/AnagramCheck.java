package strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args )
    {

        // Now Im checking the two strings
        String s1="Prasanna".toLowerCase();
        String s2="AnnasarP".toLowerCase();

        //Now convert the sttrings into arrays
        char ch1[] =s1.toCharArray();
        char ch2[]=s2.toCharArray();

        // after converting to arrays just sort the arrays using inbuilt functions

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result=Arrays.equals(ch1,ch2);
        System.out.println(result);




    }
}

//i can also can do it in js

// Function to check if two strings are anagrams
// function areAnagrams(str1, str2) {
//     // Remove spaces and convert to lowercase
//     const normalize = str => str.replace(/\s+/g, '').toLowerCase();
    
//     str1 = normalize(str1);
//     str2 = normalize(str2);

//     // If lengths differ, they cannot be anagrams
//     if (str1.length !== str2.length) return false;

//     // Sort the characters and compare
//     const sortedStr1 = str1.split('').sort().join('');
//     const sortedStr2 = str2.split('').sort().join('');

//     return sortedStr1 === sortedStr2;
// }

// console.log(areAnagrams("listen", "silent")); // true
// console.log(areAnagrams("hello", "world"));   // false

