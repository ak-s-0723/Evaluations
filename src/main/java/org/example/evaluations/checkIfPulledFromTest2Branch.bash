branch_name="test2"

# Check if we are in a git repository
if [ ! -d .git ]; then
    echo "Not a git repository."
    exit 1
fi

# Check the reflog for pull actions from the specified branch
if git reflog show | grep -q "pull.*$branch_name"; then
    echo "You have pulled from the '$branch_name' branch."
else
    echo "Error : No pulls have been detected from the '$branch_name' branch."
    exit 1
fi
