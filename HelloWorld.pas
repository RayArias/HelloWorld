program HelloWorld;
{  by Ray Arias, 03 September 2022
   version 1.00.00-delta(rc)-Bon
   Jour/Pascal N-IDE 4.3.2
   semantic version 1.0.0-rc
}


var
  a, b, c, a2, b2, c2: Real;
  i : Integer;


const
  hello = 'Hello, World';
  title =  'Pathagorean Theorem';
  formula1 = 'a² + b² = c²';
  formula2 = 'c = ±√(a² + b²)';
  endmsg = 'End of Program HelloWorld.';
  contmsg = 'Press ENTER to continue.';

function oneLess(i : Integer) : Integer;
  begin
    Write(i);
    if i > 0  then
      begin
        Write(', ');
        oneless := i - 1;
        oneLess(oneLess);
      end;
  end;


function square(x : Real) : Real ;
  begin
    square := x * x;
  end;
  

function pathagorean(a, b : Real) : Real;
  var
    a2, b2, c2, c : Real;
  begin
    a2 := square(a);
    b2 := square(b);
    c2 := a2 + b2;
    c  := Sqrt(c2);
    pathagorean := c;
 end;


uses Crt;

begin
  WriteLn('Program HelloWorld version 1.00.00-delta');
  WriteLn('(rc)-Bon Jour/Pascal N-IDE 4.3.2');
  WriteLn('By Ray Arias, 03 September 2022');
  WriteLn();
  WriteLn(contmsg);
  ReadLn();
  
  clrscr();
  WriteLn(hello);
  WriteLn();
  Write('Iteration Test: ');
  for i := 0 to 9 do
    begin
      Write(i);
      if i < 9 then Write(', ');
    end;
  WriteLn();
  WriteLn();
  Write('Recursion Test: ');
  oneLess(9);
  WriteLn();
  WriteLn();
  WriteLn(contmsg);
  ReadLn();
  
  clrscr();
  WriteLn(title);
  WriteLn(formula1);
  WriteLn(formula2);
  WriteLn();
  Write('Enter a: ');
  ReadLn(a);
  Write('Enter b: ');
  ReadLn(b);
  WriteLn();
  
  a2 := square(a);
  b2 := square(b);
  c2 := a2 + b2;
  c  := pathagorean(a, b);
  
  WriteLn('c = ±√((' + a + ')² + (' + b + ')²)');
  WriteLn('c = ±√((' + a2 + ') + (' + b2 + '))');
  WriteLn('c = ±√(' + c2 + ')');
  WriteLn('c = ±', c);
  WriteLn();
  WriteLn(endmsg);
  WriteLn(contmsg);
  ReadLn();
  
end. 
