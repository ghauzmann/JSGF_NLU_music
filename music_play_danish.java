#JSGF V1.0 utf-8 da;

grammar music_play;

public <music_play> =
  [jeg vil gerne lytte til] |
  [kan du] (sætte | spille) |
  [spil] |
  [sæt] (<artist> | <song> | <genre> [musik] | <album> [af] <artist>) [på] | [for mig];

<artist> =
  the beatles |
  radiohead |
  lady gaga |
  pink floyd |
  rasmus seebach |
  kim larsen;

<song> =
  comfortably numb |
  paranoid android |
  let it be |
  hey jude |
  øde ø |
  papirsklip;

<genre> =
  jazz |
  klassisk |
  pop |
  metal;

<album> =
  ummagumma |
  help! |
  the fame |
  the wall |
  ingen kan love dig i morgen |
  midt om natten;
