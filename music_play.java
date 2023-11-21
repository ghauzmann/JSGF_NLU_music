#JSGF V1.0 utf-8 en;

grammar music_play;

public <music_play> =
  [i want to listen to] |
  [can you] (put on | play) |
  [play me] |
  [put] (<artist> | <song> | <genre> [music] | <album> [by] <artist>) [on];

<artist> =
  the beatles |
  radiohead |
  lady gaga |
  pink floyd;

<song> =
  comfortably numb |
  paranoid android |
  let it be |
  hey jude;

<genre> =
  jazz |
  classical |
  pop |
  metal;

<album> =
  ummagumma |
  help! |
  the fame |
  the wall;
