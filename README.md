# TaskOne - Writes n lines of random numbers to a file.

## Installation
`git clone https://github.com/danielwikander/Task1`
`cd Task1`
`cd javac TaskOne.java`

## How to run
`java TaskOne [ARGUMENT] [ARGUMENT]`
For example:
`java TaskOne 10 testFile`

## Manpage
```
Synopsis 
    TaskOne [ARGUMENT] [ARGUMENT]
    
Description
    Writes n lines of random numbers to file.
    Requires both arguments to run.
    Arguments must be written in the order: n, filePath.
    Existing files will be overwritten if given as an argument.

Arguments
    n:        The number of lines to write to the file. Must be an integer.
    filePath: The path the the file to create/overwrite. Must be a valid filepath.

Examples
    TaskOne 10 newFile
        The file 'newFile' will be created and 10 lines will be written.
    TaskOne 25 testFile
        The file 'testFile' will be created and 25 lines will be written.
```
