if [ -d ".git" ]; then
  echo "The folder is a Git repository."
else
  echo "Error : The folder is not a Git repository." >&2
  exit 1
fi

repo_dir=$(basename "$(pwd)")
target_String="AssignmentRepository1"

if [[ "$repo_dir" = "$target_String" ]]; then
  echo "You have cloned correct repository. Going Great !!"
else
  echo "Error : You have cloned incorrect repository or you are not inside git repo root folder" >&2
  exit 1
fi

desired_files="Src.java Tst.java"

staged_files=$(git diff --cached --name-only)

for file in $desired_files; do
  if echo "$staged_files" | grep -q "^$file$"; then
    echo "$file is staged."
  else
    echo "Error : $file is not staged."
    exit 1
  fi
done
