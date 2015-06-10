<?php
  // Test
  //print_r($argv);
  for($i=1;$i<=$argv[1];$i++){
    if($i%3==0 && $i%5!=0){echo("Fizz");}
    elseif($i%3!=0 && $i%5==0){echo("Buzz");}
    elseif($i%3==0 && $i%5==0){echo("FizzBuzz");}
    else{echo($i);}
    echo("\n");
  }
?>
