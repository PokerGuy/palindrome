# No, I will not write you a palindrome tester

For better or worse, this question seems to come up all the time for software engineering roles. You talk to a recruiter and get screened a little on background and desired salary. Next up, you talk to someone over the phone and then you screen share and do some bullshit &#34;programming exercise&#34;, like write code that can detect if it received a palindrome.  

I joked with a friend of mine that I was 3-4 on the palindrome question. What I didn&#39;t understand was why did the one company pass on me when the other three proceeded to move me to the next round?  

&#34;Did you use recurssion?&#34; he asked.

&#34;Um, no. I just take a string and then create a new string by iterating over the first string backwards. Then I compare the two strings with the equals method,&#34; I was confused.  

&#34;Yeah, you should create a function that trims the first character of the string and compares it to the last character. If equal, send a trimmed string back to the function and repeat. It&#39;s faster this way because it breaks the loop at the first sign of not being a match.&#34;  

So, here it is. A recursive palindrome tester in Java. Clone this repo.

`javac Palindrome.java`

`java Palindrome Taco cat`

Comes back true.

`java Palindrome Coding interviews are stupid`

Comes back false, but the real answer is true.  

For all of this supposed shortage of talent in tech, it is hiring practices like this that are causing the problem. As an employer in an industry that values **INNOVATION** why interview candidates based on their ability do rote memorization? Do you want to hire canidates who read &#34;Cracking the Coding Interview&#34; or candidates who can actually think?

Most problems in Software Engineering come from being able to understand requirements, push back on bad decisions, and knowing how to do CRUD operations. Knowing how to store the data, secure the data, and retrieve the data along with sensible validation rules are waaaaaaaaay more important than memorizing someone else&#39;s algorithm and hoping to win the algorithm lottery.

So next time you&#39;re at an interview see if you can showcase some of your code on github, or talk about how you solved a problem in a previous role. If they still want to test a string to see if it&#39;s a palindrome, ask yourself, &#34;Do I really want to work here?&#34; If the answer is still yes, then pretend this is the very first time you heard this question and regurgitate this answer. You are welcome.

Personally, I think I would do my best Nancy Reagan impression and &#34;Just say no!&#34; Unless, of course I was interviewing at one of the FANG companies that everyone on the Blind insists is offering an $80k signing bonus, $200k in salary, and $300k in Restricted Stock Units, in which case:

> I&#39;m your private dancer,
A dancer for money,
And any old music will do
> &ndash; Tina Turner
