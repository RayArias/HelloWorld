' Program HelloWorld by Ray Arias
' in FreeBasic 1.06.0
' and the BASIC Programming Compiler
' for Android by Kappsmart
' 03 September 2022, version 1.01.00-
' delta(rc)-Hello/FreeBasic

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

declare function oneLess(as single) as single
function oneLess(i as single) as single
  Print i;
  if i > 0 then Print ","; : oneLess(i - 1) : return i - 1
end function

' Main Section
Cls 0
Print "Program HelloWorld v.1.01.00-delta(rc)-"
Print "Hello/FreeBasic by Ray Arias"
Print "03 September 2022 (minor revision)."
Print
Print __FB_SIGNATURE__
'Displays name and version of compiler
Print
Print "Hello World!"
Print

Print "Iteration Test:"
For i as single = 0 to 9 step 1
    Print i;
    if i < 9 then Print ",";
next i
Print : Print
Print "Recursion Test:"
oneLess(9)
Print : Print

' Although the language FreeBasic
' supports Unicode and a graphics
' display, the BASIC Programming
' Compiler app for Android by
' Kappsmart does NOT display these
' features.
Print "Character Set Test:"
for j as single = 32 to 127
   Print Chr(j);
next j

' Display mathematical and
' scientific constants
Print : Print
Print "Some mathematical and scientific constants:"
Print "pi = "; pi
Print
Print "e  = "; e
Print
Print Space(s1); NAexp
Print "N  = "; NAbase; " X 10"
Print " A  "; Space(s1); Gunit1
Print Space(s1); Gexp; " "; Gunit2
Print "G  = "; Gbase; " X 10    "; Gunit3
Print Space(s2); Gunit4
Print Space(s2); Gunit5

' Display end message 
Print
Print "End of Program HelloWorld."

