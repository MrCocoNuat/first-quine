# first-quine
A Java program that prints itself!

Well, almost. quine.java is an ASCII encoded file, but Powershell's output-to-file is always UTF-16.
Worse, javac won't compile UTF-16 files, at least by default!
Piping to Out-File -encoding ascii works well enough, producing a totally identical java source file:

SHA-256 8E3454F474A5D1712B902F016A1BC10D49F0D8E818372957868C7DF63F14050B

Maybe text encoding works better in \*nix. Oh well. 

No comments for now because including them in quines actually takes work.
