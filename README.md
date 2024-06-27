# Report for Assignment 1




## Project chosen


Name: jabref


URL: https://github.com/JabRef/jabref


Number of lines of code and the tool used to count it: 180 kloc, Lizard


Programming language: Java




## Coverage measurement
### Existing tool


<Inform the name of the existing tool that was executed and how it was executed>
Jacoco
1. The build.gradle file was configured to include the JaCoCo plugin. 
plugins {
    id 'jacoco'
}


jacoco {
    toolVersion = "0.8.10"
}


jacocoTestReport {
    dependsOn test
    reports {
        xml.required = true
        csv.required = false
        html.outputLocation = layout.buildDirectory.dir('jacocoHtml')
    }
}


2. Run  ./gradlew clean test jacocoTestReport 


<Show the coverage results provided by the existing tool with a screenshot>
  



  



### Your own coverage tool


<The following is supposed to be repeated for each group member>
<Group member name>
<Xingyun Wang>
<Function 1 name>
equals() 
Path：jabref > src > main > java > org > jabref > model > groups > ExplicitGroup > equals




<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/xingyun-w/jabref/pull/1/commits/6d9946f3233a492e86331d573c4c2f70018186e6
  



<Provide a screenshot of the coverage results output by the instrumentation>
  

/Run  ./gradlew test --tests "org.jabref.model.groups.ExplicitGroupTest"  
to see print messages.




<Function 2 name>
get()
  



<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/JabRef/jabref/commit/0a7060ee314f2edd5230ad970bb4c40804326007


  



<Provide a screenshot of the coverage results output by the instrumentation>
./gradlew test --tests "org.jabref.gui.keyboard.KeyBindingsTabModelTest" 


  





<Group member name>
<Yiyang Sun>
<Function 1 name>
getMainFileDirectory()


Path: 
JabRef > org.jabref.preferences > FilePreferences


<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/xingyun-w/jabref/commit/87927dd030eef4bee7ac00cabca5843420eb9fbc


  

  



<Provide a screenshot of the coverage results output by the instrumentation>
  

  



Run: 
./gradlew clean test --tests org.jabref.preferences.FilePreferencesTest


Check printout info: 
build/reports/test/index.html


<Function 2 name>
getWriteMetadatatoPdf()


Path: 
JabRef > org.jabref.cli > JabRefCLI


<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/JabRef/jabref/commit/b9473f6448abe68e9aa53c67b50c597f6ad45175


  

  

  



<Provide a screenshot of the coverage results output by the instrumentation>
  

  



Run: 
./gradlew clean test --tests org.jabref.cli.JabRefCLITest


Check printout info: 
build/reports/test/index.html


<Group member name>
<YuliWang>
        <Function 1 name>
public boolean equals(Object o)
src/main/java/org/jabref/gui/theme/Theme-public boolean equals(Object o)
  



<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
  
  

<Provide a screenshot of the coverage results output by the instrumentation>
./gradlew test --tests "org.jabref.gui.theme.ThemeTest"
  

<Function 2 name>
void deleteAbbreviation()
src/main/java/org/jabref/gui/preferences/journals/JournalAbbreviationsTabViewModel.java-public void deleteAbbreviation()


<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>

  

  



<Provide a screenshot of the coverage results output by the instrumentation>
./gradlew test --tests "org.jabref.gui.preferences.journals.JournalAbbreviationsViewModelTabTest"
  

  





## Coverage improvement
### Individual tests


<The following is supposed to be repeated for each group member>
<Group member name>
<Xingyun Wang>
<Test 1>


<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/JabRef/jabref/commit/0a7060ee314f2edd5230ad970bb4c40804326007
See changes in src/test/java/org/jabref/model/groups/ExplicitGroupTest.java
  



<Provide a screenshot of the old coverage results (the same as you already showed above)>
  



<Provide a screenshot of the new coverage results>
  



<State the coverage improvement with a number and elaborate on why the coverage is improved>


Improve 45%


  



Originally there were no explicit test cases focused on the equals() method. The first few tests use self-comparison, comparisons of different groups, and edge testing to ensure that the first two branches are covered. Then I created test cases targeting the third branch, which covers a variety of attributes, such as name, hierarchical context, and icon, to ensure all specific branches within the equals() method are exercised.


<Test 2>


<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/JabRef/jabref/commit/e01d36b7c093e79f92eb839e238c31636eba3b9c
See changes in src/test/java/org/jabref/gui/keyboard/KeyBindingsTabModelTest.java

  



<Provide a screenshot of the old coverage results (the same as you already showed above)>
  



<Provide a screenshot of the new coverage results>
  



<State the coverage improvement with a number and elaborate on why the coverage is improved>


Improve 75%


  





The console messages indicate that only the first branch is being hit. To cover all branches, I have added two test cases: one for handling the case where the result is null, and another for when there is no key binding. 


<Group member name>
<Yiyang Sun>
<Test 1>


<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/xingyun-w/jabref/commit/87927dd030eef4bee7ac00cabca5843420eb9fbc


  



<Provide a screenshot of the old coverage results (the same as you already showed above)>
  



<Provide a screenshot of the new coverage results>
  



<State the coverage improvement with a number and elaborate on why the coverage is improved>


The coverage has improved by 100%.


The getMainFileDirectory() function has two possible outcomes: it either returns the correct path or it returns null. I can achieve full coverage by writing tests that cover both scenarios.


<Test 2>


<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
        https://github.com/JabRef/jabref/commit/b9473f6448abe68e9aa53c67b50c597f6ad45175
        
  

  



<Provide a screenshot of the old coverage results (the same as you already showed above)>
  



<Provide a screenshot of the new coverage results>
  



<State the coverage improvement with a number and elaborate on why the coverage is improved>


The coverage has improved by 100%.


There are four possible data scenarios for getWriteMetadatatoPdf(): Metadata, XMP, embeddBibfile, and null. Therefore, four tests need to be written to cover these scenarios. Additionally, before each test, it is essential to create a JabRefCLI object and mock the command line because getWriteMetadatatoPdf() retrieves its information from the command line.


<Group member name>
<Yuli Wang>


<Test 1>
for the Theme.euqals


<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
  



<Provide a screenshot of the old coverage results (the same as you already showed above)>
  



<Provide a screenshot of the new coverage results>
  



<State the coverage improvement with a number and elaborate on why the coverage is improved>
The coverage improved by 80 percent.
For the equals method, there’s 4 main conditional branches: “this == o”,”o == null”,”getClass() != 0.getClass()” and “type & name things”, thus, there’s at most 7 specific case for these 4 branches: self-comparison for “this == o”,compare with null for “o == null”,compare with object and different class for “getClass() != 0.getClass()”, and the other 4 kinds of same types & names, same types different names, same names different types, and different sames & types; by applying these test functions, the coverage improves from 10% to 90%.


<Test 2>


<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
  

  



<Provide a screenshot of the old coverage results (the same as you already showed above)>
  



<Provide a screenshot of the new coverage results>
  



<State the coverage improvement with a number and elaborate on why the coverage is improved>
The coverage improved by 63%.
In the existing test(line 580), for the deleteAbbreviation method, the following branches are covered: currentAbbreviation != null, !currentAbbreviation.get().isPseudoAbbreviation(), and index > 1. This scenario tested includes setting a valid non-pseudo abbreviation and checking the deletion process when the abbreviation index is greater than 1.
The original tests are intertwined with other parts, making modifications cumbersome. Therefore, I have rewritten the test functions for all branches: Current Abbreviation is null,Current Abbreviation is pseudo,Current Abbreviation is not null nor pseudo, with index >1, <=1,or index + 1 <abbreviationsCount.get(),index + 1 >= abbreviationsCount.get()




### Overall
<Provide a screenshot of the old coverage results by running an existing tool (the same as you already showed above)>
  



<Provide a screenshot of the new coverage results by running the existing tool using all test modifications made by the group>
  



The coverage has improved by 1%，from 47% to 48%.


## Statement of individual contributions


<Write what each group member did>


<Xingyun Wang>
Instrument and improve code coverage of equals() and get().


<Yiyang Sun>
Instrument and improve code coverage of getMainFileDirectory()
 and getWriteMetadatatoPdf().


<Yuli Wang>
Instrument and improve code coverage of deleteAbbreviation() and boolean equals(Object o).