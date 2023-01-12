# Password
<h3>Check password validity rules:</h3>
</br>You are provided with the so-called "check string", where:
</br>• The first character is a digit that represents the number of uppercase symbols in the correct password.
</br>• The next 3 characters are last 3 characters of the correct password in reverse order.
</br>• The last characters represent the sum of all digits in the password.
</br>Find the correct password
</br>Examples:
</br>Input: ["P@ssWORD1","20passWORD20", "PASSword"] , "4dro6"
</br>Output: PASS6word
</br>Input: ["theBestpassword", "myPassword#3"], "1dro0"
</br>Output: theBestpassword
</br>Input: ["MyPassword2", "crazyPassword1#$%"], "1%$#1"
</br>Output: crazyPassword1#$%
</br>Input: ["luckyPASSWORD#$$$", "luckyDay666"], "6pass7" 
</br>Output: [nothing]
