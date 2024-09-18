FILENAME="Main.java"

# Check if the file is in the staging area
if git diff --cached --name-only | grep -Fxq "$FILENAME"; then
    echo "Error : The file '$FILENAME' is in the staging area."
else
    echo "The file '$FILENAME' is not in the staging area."
fi
