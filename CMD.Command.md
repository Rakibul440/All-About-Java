# CMD Command
Here are some of the most important and commonly used commands in CMD (Command Prompt or DOS):

### 1. **Basic Navigation and File Management**
- **dir**: Lists the files and directories in the current directory.
  ```
  dir
  ```
- **cd**: Changes the current directory.
  ```
  cd folder_name
  ```
- **cd ..**: Moves up one directory level.
  ```
  cd ..
  ```
- **mkdir**: Creates a new directory.
  ```
  mkdir new_folder
  ```
- **rmdir**: Deletes a directory (it must be empty).
  ```
  rmdir folder_name
  ```
- **del**: Deletes a file.
  ```
  del filename.txt
  ```

### 2. **System Information and Network**
- **ipconfig**: Displays network configuration details, like IP address, subnet mask, and default gateway.
  ```
  ipconfig
  ```
- **ping**: Tests network connectivity to another machine or device.
  ```
  ping google.com
  ```
- **systeminfo**: Displays detailed information about your system.
  ```
  systeminfo
  ```
- **tasklist**: Displays a list of currently running processes.
  ```
  tasklist
  ```
- **taskkill**: Terminates a running process.
  ```
  taskkill /IM processname.exe
  ```

### 3. **File Operations**
- **copy**: Copies files from one location to another.
  ```
  copy source_file destination
  ```
- **xcopy**: Copies files and directories, including subdirectories.
  ```
  xcopy source_folder destination_folder /s /e
  ```
- **move**: Moves a file or directory to a different location.
  ```
  move source_file destination_folder
  ```

### 4. **Disk Management**
- **chkdsk**: Checks the disk for errors and fixes them.
  ```
  chkdsk C:
  ```
- **format**: Formats a drive or partition.
  ```
  format C:
  ```
- **diskpart**: A command-line utility for disk partitioning and management.
  ```
  diskpart
  ```

### 5. **Batch and Scripting**
- **echo**: Displays a message or turns on/off command echoing.
  ```
  echo Hello, World!
  ```
- **pause**: Pauses the batch file and waits for user input to continue.
  ```
  pause
  ```
- **exit**: Exits the command prompt or closes a batch script.
  ```
  exit
  ```

### 6. **Environment Variables and System Configuration**
- **set**: Displays, sets, or removes environment variables.
  ```
  set PATH=C:\NewPath
  ```
- **path**: Displays or sets the command search path.
  ```
  path
  ```
- **cls**: Clears the screen.
  ```
  cls
  ```

### 7. **Power and Shutdown**
- **shutdown**: Shuts down or restarts the computer.
  ```
  shutdown /s /t 0  (for shutdown)
  shutdown /r /t 0  (for restart)
  ```

### 8. **Other Useful Commands**
- **cls**: Clears the terminal screen.
  ```
  cls
  ```
- **help**: Displays a list of commands or help on a specific command.
  ```
  help
  help command_name
  ```

These commands can be super helpful when you're working with the Windows command line, and mastering them gives you more control over system management and file operations. Let me know if you need more details or specific usage examples!