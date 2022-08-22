' Program HelloWorld by Ray Arias
' in FreeBasic 1.06.0
' and the BASIC Programming Compiler
' for Android by Kappsmart
' 22 August 2022, version 1.0-gamma

' Define some mathematical and
' scientific constants
const as double pi = Acos(-1)
' arccos -1 is pi
const as double e = Exp(1)
const as double NAbase = 6.02214076
const as single NAexp = 23
const as double Gbase = 6.6743015
const as single Gexp = -11
const as String Gunit1 = "  2"
const as String Gunit2 = "Nm "
const as String Gunit3 = "---"
const as String Gunit4 = "  2"
const as String Gunit5 = "kg"
const as single s1 = 20
const as single s2 = 24

' Main Section
Cls 0
Print __FB_SIGNATURE__
'Displays name and version of compiler
Print
Print "Hello World!"
Print
Print "Loop Count Test:"
For i as single = 0 to 9 step 1
    Print i
next i
Print
' Although the language FreeBasic
' supports Unicode and a graphics
 'display, the BASIC Programming
' Compiler app for Android by
' Kappsmart does NOT display these
' features.
Print "Character Set Test:"
for j as single = 32 to 127
   Print Chr(j);
next j
' Display mathematical and
' scientific constants
Print
Print
Print "Some mathematical and scientific constants:"
Print "pi = "; pi
Print "e  = "; e
Print
Print Space(s1); NAexp
Print "NA = "; NAbase; " X 10"
Print Space(s2); Gunit1
Print Space(s1); Gexp; " "; Gunit2
Print "G  = "; Gbase; " X 10    "; Gunit3
Print Space(s2); Gunit4
Print Space(s2); Gunit5

' Display end message 
Print
Print "End of HelloWorld program."

