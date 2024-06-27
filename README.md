# Report for Assignment 1
## Project chosen

Name: jabref

URL: https://github.com/JabRef/jabref

Number of lines of code and the tool used to count it: 180 kloc, Lizard

Programming language: Java


## Coverage measurement
### Existing tool

< Inform the name of the existing tool that was executed and how it was executed>
Jacoco.

The build.gradle file was configured to include the JaCoCo plugin.
<img width="439" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/b655ebfb-4a26-406c-94d8-fe3024ac544b">


Run  ./gradlew clean test jacocoTestReport

< Show the coverage results provided by the existing tool with a screenshot>

<img width="640" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/3775b244-eaa0-4d89-a9ed-b5386f688ac8">



### Your own coverage tool

< The following is supposed to be repeated for each group member>

< Xingyun Wang>

<Function 1 name>
equals()
Path：jabref > src > main > java > org > jabref > model > groups > ExplicitGroup > equals


<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/xingyun-w/jabref/pull/1/commits/6d9946f3233a492e86331d573c4c2f70018186e6
<img width="684" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/3499c32b-51e5-4c71-aa61-bdd95b070ce4">


< Provide a screenshot of the coverage results output by the instrumentation>
<img width="808" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/2bd066d4-332b-40db-9f1e-37cb7597bc8d">

/Run  ./gradlew test --tests "org.jabref.model.groups.ExplicitGroupTest"  
to see print messages.


<Function 2 name>
get()
<img width="599" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/587e6d6e-84a3-4182-a493-1db669c3f1a9">


<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/JabRef/jabref/commit/0a7060ee314f2edd5230ad970bb4c40804326007
<img width="687" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/dc143f01-54b7-491e-88d0-18f85a11a41b">



< Provide a screenshot of the coverage results output by the instrumentation>
./gradlew test --tests "org.jabref.gui.keyboard.KeyBindingsTabModelTest" 
<img width="841" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/b0c29449-be15-429e-a454-f80c348241f6">




< Yiyang Sun>

<Function 1 name>

getMainFileDirectory()

Path:
JabRef > org.jabref.preferences > FilePreferences

<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/xingyun-w/jabref/commit/87927dd030eef4bee7ac00cabca5843420eb9fbc
<img width="427" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/6f1c9ed7-17f1-4912-a448-0de33d458cb0">
<img width="425" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/dfcf55e0-d979-4a2a-a1fd-464f590cc69f">




< Provide a screenshot of the coverage results output by the instrumentation>
<img width="610" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/a67514a6-54a1-4752-a48b-d94879eb15e6">



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
<img width="578" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/f6216a92-226e-428c-b6a5-2fcfd867b746">





< Provide a screenshot of the coverage results output by the instrumentation>
<img width="599" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/9a2494e3-7916-4324-8490-625c2254c9d5">



Run:
./gradlew clean test --tests org.jabref.cli.JabRefCLITest

Check printout info:
build/reports/test/index.html

< YuliWang>

< Function 1 name >

public boolean equals(Object o)
src/main/java/org/jabref/gui/theme/Theme-public boolean equals(Object o)


<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/JabRef/jabref/commit/452950e5ed1ffcbdb3368fbf97cbc3c097582e59
<img width="596" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/a2bf726e-eaf2-426a-a788-976e4ad91a02">
<img width="601" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/03549baf-a39b-446c-b595-e0f130c1198f">


<Provide a screenshot of the coverage results output by the instrumentation>
./gradlew test --tests "org.jabref.gui.theme.ThemeTest"
<img width="380" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/965b8180-94b4-4b49-afda-44fa33c51a3f">


<Function 2 name>

void deleteAbbreviation()
src/main/java/org/jabref/gui/preferences/journals/JournalAbbreviationsTabViewModel.java-public void deleteAbbreviation()

<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>
https://github.com/JabRef/jabref/commit/59f312b61265b8ca3766f749aa6bbf7c982fa3b0
<img width="599" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/1f88b596-2de6-400a-a0c7-52342d6ce794">
<img width="598" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/16f9027e-12a2-4605-8a83-b5d13d268b45">


< Provide a screenshot of the coverage results output by the instrumentation>
./gradlew test --tests "org.jabref.gui.preferences.journals.JournalAbbreviationsViewModelTabTest"
<img width="508" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/afc2ae78-9b6b-4abb-840b-b13315b3e0ec">




## Coverage improvement

### Individual tests

< The following is supposed to be repeated for each group member>

< Xingyun Wang>

<Test 1>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/JabRef/jabref/commit/0a7060ee314f2edd5230ad970bb4c40804326007
See changes in src/test/java/org/jabref/model/groups/ExplicitGroupTest.java
<img width="765" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/999c1004-f64d-4c4e-ab7f-5bf8af1a911b">


<Provide a screenshot of the old coverage results (the same as you already showed above)>
<img width="806" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/4d773b41-d57c-4e07-98cb-9454d562790f">


< Provide a screenshot of the new coverage results>
<img width="816" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/d5032e04-27d2-4884-aca4-81323384eb10">


< State the coverage improvement with a number and elaborate on why the coverage is improved>

Improve 45%

<img width="641" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/4916ba80-390f-4315-8723-b087b9c9bfab">


Originally there were no explicit test cases focused on the equals() method. The first few tests use self-comparison, comparisons of different groups, and edge testing to ensure that the first two branches are covered. Then I created test cases targeting the third branch, which covers a variety of attributes, such as name, hierarchical context, and icon, to ensure all specific branches within the equals() method are exercised.

<Test 2>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/JabRef/jabref/commit/e01d36b7c093e79f92eb839e238c31636eba3b9c
See changes in src/test/java/org/jabref/gui/keyboard/KeyBindingsTabModelTest.java
<img width="765" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/c75e47a1-e5b8-414e-8d34-1cbf7b7b0f36">




<Provide a screenshot of the old coverage results (the same as you already showed above)>
<img width="843" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/a3a30121-3574-484e-9628-22bfe8af59f2">


< Provide a screenshot of the new coverage results>
<img width="841" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/bdb9ef0d-428c-4cd5-9618-0bbfdc30607f">


< State the coverage improvement with a number and elaborate on why the coverage is improved>

Improve 75%

<img width="730" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/c2b2e1f6-4b56-4aa5-8b08-c0ff7f122dde">



The console messages indicate that only the first branch is being hit. To cover all branches, I have added two test cases: one for handling the case where the result is null, and another for when there is no key binding.

< Yiyang Sun>

<Test 1>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/xingyun-w/jabref/commit/87927dd030eef4bee7ac00cabca5843420eb9fbc
<img width="493" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/40766081-b253-4a29-bfca-5a3091ca19d7">



<Provide a screenshot of the old coverage results (the same as you already showed above)>
<img width="599" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/4489cf69-84e3-4c27-b484-5442fac7731d">


< Provide a screenshot of the new coverage results>
<img width="604" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/249de895-bea9-4861-ac26-ead4a2c6103a">


< State the coverage improvement with a number and elaborate on why the coverage is improved>

The coverage has improved by 100%.

The getMainFileDirectory() function has two possible outcomes: it either returns the correct path or it returns null. I can achieve full coverage by writing tests that cover both scenarios.

<Test 2>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/JabRef/jabref/commit/b9473f6448abe68e9aa53c67b50c597f6ad45175
<img width="650" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/4cfde6bf-0bb5-4b9a-90b7-7cb0cbdd2cc5">
<img width="653" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/2474f4ec-89c5-4171-b0f9-a90875c17a2c">




<Provide a screenshot of the old coverage results (the same as you already showed above)>
<img width="586" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/c0fc9c63-c739-4776-8e75-bd031d3c32fa">


< Provide a screenshot of the new coverage results>
<img width="600" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/4ea10bc4-a5a4-4797-a9d5-e86026829f63">


< State the coverage improvement with a number and elaborate on why the coverage is improved>

The coverage has improved by 100%.

There are four possible data scenarios for getWriteMetadatatoPdf(): Metadata, XMP, embeddBibfile, and null. Therefore, four tests need to be written to cover these scenarios. Additionally, before each test, it is essential to create a JabRefCLI object and mock the command line because getWriteMetadatatoPdf() retrieves its information from the command line.

< Yuli Wang>

<Test 1>

for the Theme.euqals

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/JabRef/jabref/commit/2702701f0e8319a88f6d029ac85e5cecc8f575e5
<img width="601" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/6188013f-7fe2-4208-b4a3-e84ce55247fd">

<Provide a screenshot of the old coverage results (the same as you already showed above)>
<img width="596" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/a6fad0e6-4512-4d63-9d61-37e24690f662">


< Provide a screenshot of the new coverage results>
<img width="605" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/a3a7fa12-fc2c-438a-a270-d5c569649390">


< State the coverage improvement with a number and elaborate on why the coverage is improved>
The coverage improved by 80 percent.
For the equals method, there’s 4 main conditional branches: “this == o”,”o == null”,”getClass() != 0.getClass()” and “type & name things”, thus, there’s at most 7 specific case for these 4 branches: self-comparison for “this == o”,compare with null for “o == null”,compare with object and different class for “getClass() != 0.getClass()”, and the other 4 kinds of same types & names, same types different names, same names different types, and different sames & types; by applying these test functions, the coverage improves from 10% to 90%.

<Test 2>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>
https://github.com/JabRef/jabref/commit/c5393ddbcd821a47123ad54608531301ce4a6473
<img width="597" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/e860b09b-5a8f-4240-9ea9-4b0b5fe0d995">
<img width="599" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/c087d527-1605-4530-9aba-3f00fb859455">


<Provide a screenshot of the old coverage results (the same as you already showed above)>
<img width="597" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/88da7c37-a8ad-40a0-ac85-cd51faf1cfc6">


< Provide a screenshot of the new coverage results>
<img width="605" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/6df8ee06-aa80-4340-ba01-de50cb90d7ea">


< State the coverage improvement with a number and elaborate on why the coverage is improved>
The coverage improved by 63%.
In the existing test(line 580), for the deleteAbbreviation method, the following branches are covered: currentAbbreviation != null, !currentAbbreviation.get().isPseudoAbbreviation(), and index > 1. This scenario tested includes setting a valid non-pseudo abbreviation and checking the deletion process when the abbreviation index is greater than 1.
The original tests are intertwined with other parts, making modifications cumbersome. Therefore, I have rewritten the test functions for all branches: Current Abbreviation is null,Current Abbreviation is pseudo,Current Abbreviation is not null nor pseudo, with index >1, <=1,or index + 1 <abbreviationsCount.get(),index + 1 >= abbreviationsCount.get()


### Overall

<Provide a screenshot of the old coverage results by running an existing tool (the same as you already showed above)>
<img width="649" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/b2742325-357e-441e-b193-fe12cead49c6">


< Provide a screenshot of the new coverage results by running the existing tool using all test modifications made by the group>
<img width="676" alt="image" src="https://github.com/xingyun-w/jabref/assets/114107432/3be774ee-3493-4548-9494-205c5225c5d3">


The coverage has improved by 1%，from 47% to 48%.

## Statement of individual contributions

< Write what each group member did>

Xingyun Wang:
Instrument and improve code coverage of equals() and get().

Yiyang Sun:
Instrument and improve code coverage of getMainFileDirectory()
and getWriteMetadatatoPdf().

Yuli Wang:
Instrument and improve code coverage of deleteAbbreviation() and boolean equals(Object o).

