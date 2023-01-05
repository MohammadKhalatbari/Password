# Password
<h3>Check password validity rules:<h3>
You are provided with the so-called "check string", where:
• The first character is a digit that represents the number of uppercase symbols in the correct password.
• The next 3 characters are last 3 characters of the correct password in reverse order.
• The last characters represent the sum of all digits in the password.
Find the correct password
Examples:
Input: ["P@ssWORD1","20passWORD20", "PASSword"] , "4dro6"
Output: PASSword
Input: ["theBestpassword", "myPassword#3"], "1dro0"
Output: theBestpassword
Input: ["MyPassword2", "crazyPassword1#$%"], "1%$#1"
Output: crazyPassword1#$%
Input: ["luckyPASSWORD#$$$", "luckyDay666"], "6pass7" 
Output: [nothing]
