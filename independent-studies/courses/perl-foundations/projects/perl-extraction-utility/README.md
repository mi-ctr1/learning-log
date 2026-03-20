# Log Parsing & Pattern Extraction Utility

A lightweight Perl command-line utility for parsing application logs and extracting IPv4 addresses using regular expressions.

This tool demonstrates basic log analysis techniques by scanning log files line-by-line and identifying IPv4 patterns within log entries.


## Overview

Logs are a critical component of modern software systems. They provide insight into system behavior, debugging information, and operational events.

This utility demonstrates how pattern matching can be used to extract useful information, such as client IP addresses from log files for debugging, monitoring, or analysis.

The script reads a log file and prints any detected IPv4 addresses found within the log entries.


## Features
- Parses application log files
- Extracts IPv4 addresses using Perl regular expressions
- Processes logs line-by-line for efficient parsing
- Simple command-line execution

## Example
***Output:***
```
45.33.12.199
10.10.10.10
8.8.8.8
172.31.255.12
185.220.101.45
192.168.1.14
```


## Planned Improvements

This utility is designed to expand into a more flexible log parsing tool. Potential improvements include:

Multiple Pattern Extraction
Support extracting multiple patterns from log files, such as:
- timestamps
- error messages
- log severity levels (INFO, WARN, ERROR)
- user identifiers

