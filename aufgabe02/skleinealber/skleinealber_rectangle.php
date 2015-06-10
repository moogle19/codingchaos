<?php
  $len = $argv[1];
  $hgt = $argv[2];
  if($hgt>$len){
    $len=$argv[2];
    $hgt=$argv[1];
  }
  $v = $len * $hgt;
  $rest = $hgt;
  while($v>0){
    $v=tmp($v,$rest);
    $rest = $v/$rest;
  }

  function tmp($vo,$w)
  {
    //echo("REST: $vo");
    while($vo>=($w*$w)){
      $vo -= ($w*$w);
      echo("$w, ");
      if($vo==0){echo("!");exit;}
    }
    return $vo;
  }
?>