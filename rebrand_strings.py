import os
import re
import glob

def replace_case_insensitive(text):
    # Handle all-caps
    text = text.replace("TELEGRAM", "AXOGRAM")
    # Handle title case
    text = text.replace("Telegram", "AxoGram")
    # Handle lower case
    text = text.replace("telegram", "axogram")
    return text

def rebrand_strings():
    # Find all strings.xml files
    files = []
    for root, dirs, files_in_dir in os.walk("TMessagesProj/src/main/res"):
        for file in files_in_dir:
            if file == "strings.xml":
                files.append(os.path.join(root, file))

    print(f"Found {len(files)} strings.xml files")

    for file_path in files:
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()

        def replace_content(match):
            tag_start = match.group(1)
            text = match.group(2)
            tag_end = match.group(3)
            new_text = replace_case_insensitive(text)
            return f"{tag_start}{new_text}{tag_end}"

        new_content = re.sub(r'(<string[^>]*>)(.*?)(</string>)', replace_content, content, flags=re.DOTALL)

        if new_content != content:
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write(new_content)
            print(f"Updated {file_path}")

if __name__ == "__main__":
    rebrand_strings()
