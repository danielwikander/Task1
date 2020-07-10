# TaskOne - Writes n lines of random numbers to a file.

## SYNOPSIS 
    TaskOne [ARGUMENT] [ARGUMENT] \n\n" +
    
## DESCRIPTION
    Writes n lines of random numbers to file.
    Requires both arguments to run.
    Arguments must be written in the order: n, filePath.
    Existing files will be overwritten if given as an argument.

## ARGUMENTS
    n:        The number of lines to write to the file. Must be an integer.
    filePath: The path the the file to create/overwrite. Must be a valid filepath.

## EXAMPLES
    TaskOne 10 newFile
        The file 'newFile' will be created and 10 lines will be written.
    TaskOne 25 testFile
        The file 'testFile' will be created and 25 lines will be written.
