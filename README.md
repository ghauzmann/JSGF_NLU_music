NLP challenge Danish: JSGF development

Task 1: Extending the English grammar

Can be seen in seperate file

Task 2: Localize the JSGF grammar in your language

Can be seen in seperate file

2.2: Sample utterances the JSGF can produce in Danish

[sæt]<unk> [lady gaga]<artist> [på]<unk>
[kan du spille]<unk> [midt om natten]<album> [af]<unk> [kim larsen]<artist> [for mig]<unk>
[jeg vil gerne lytte til]<unk> [øde ø]<song> 
[spil]<unk> [klassisk]<genre> [musik]<unk> 
	[kan du sætte]<unk> [pink floyd]<artist> [på]<unk>
2.3: Possible issues if extensions of grammar considerably in Danish

There are multiple potential issues that may arise if the grammar were to be extended considerably in Danish.

•	Expansion of vocabulary and rules
o	With the extension of the grammar in Danish, the overall system naturally becomes more complex and intertwined resulting in being more prone to errors or misunderstandings.

o	This could potentially be mitigated by keeping a systematic approach to the overall structure of the grammar and rules, including working towards a general inclusion of containerization and modularity of rules and entities. 

o	An example of this from the previous example could be to wrap all of the named entities used within the music play intent such as <artist> and <song> under one named entity such as music_entity.

•	Overall maintainability of scaling
o	Due to the grammar, entities and rules growing, it will ultimately become more difficult navigating in the grammar in terms of the maintenance, merging, integration and general updating of both new grammar as well as how it fits in with the already existing grammar.

o	Some ways of overcoming these challenges would be to keep a strict methodology in terms of overall documentation in place in addition to operating with clear version control.

•	User Experience
o	When a grammar is extended considerably, the level of complexion of the overall system and grammar increases with potential ambiguity arising and rules having a chance of not integrating well or overlapping with others. Consequently, this can lead to poor overall and specific performance and ultimately a worse experience for the user.   

o	This issue can potentially be tackled by including standards of sustained testing of the grammar with multiple various inputs from real users as part of a continuous feedback loop. This can effectively result in the inclusion of usability research and studies where issues and bottlenecks are not only identified but also addressed and resolved in a systematic approach.  






2.4: Complications of features of the Danish language   

There are various features of the Danish language that can result in the localization or writing of the grammar being somewhat complicated, especially when also considering general speech recognition.

•	Differences in regional dialects and accents
o	Even though Danish is a small language spread over a fairly small geographical area, there are indeed many nuances in the various dialects of different regions and areas. Not only are the pronunciations of words different, but actual vocabulary and grammatical structure can also vary between dialects. Additionally, foreign accents with non-perfect or native pronunciations coupled with grammatical errors can also lead to complications given that most native Danish speakers are not extremely exposed to various foreign accents in Danish and therefore have comprehension issues if the Danish is not near perfect.

o	Some ways of mitigating these complications would be to incorporate different variations of the pronunciation, vocabulary and grammatical structure into the grammar. Additionally, specific rules or modules pertaining to various dialects or accents could also be incorporated with the assistance of users who utilize or speak these regional dialects or foreign accents in their daily life.    

•	Pronunciation in Danish
o	There is an overarching complication of Danish which relates to the verbal pronunciation. Danish as a language tends to be quite informal as well as to include lots of general mumbling when spoken. Furthermore, lots of words in Danish are not pronounced the way they are written. Some examples could be the soft consonants at the of words like the “d” in “hvad” or the “g” in “jeg”. 

o	This might be solved by including various rules and multiple variations of the most common ways of (mis)pronunciation as well as both formal and informal alternatives of vocabulary and grammatical structure.

•	Inflectional word endings and agreement of gender and noun
o	As many other languages, Danish also includes inflectional word endings such as altering a noun from singular to plural (appelsin  appelsiner) or the altercation of a tense of a verb (hører  hørte). Furthermore, the gender of a noun also has an impact on the sentence structure with the two main genders being common and neuter. (en hund vs. et træ).

o	In these cases it could prove beneficial to include rules to consider the gender agreement in noun phases and potentially also incorporate the usage of placeholders for both articles and adjectives when considering the different forms for genders. Additionally, rules to account for common word ending inflections could be included with the integration of alternative forms.      
