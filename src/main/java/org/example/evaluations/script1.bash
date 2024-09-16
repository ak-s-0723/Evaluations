message_pattern="Added Src and Tst Files"

matching_commits=$(git log --all --grep="$message_pattern" --pretty=format:"%H %s")

if [ -n "$matching_commits" ]; then
  echo "Found commits with the message pattern '$message_pattern':"
else
  echo "Error : No commits found with the message pattern '$message_pattern'."
  exit 1
fi

files=("Src.java" "Tst.java")

file_matching_commits=""

for file in "${files[@]}"; do
  file_commits=$(git log --all --pretty=format:"%H %s" -- "$file")

  if [ -n "$file_commits" ]; then
    file_matching_commits+="$file_commits"$'\n'
  fi
done

if [ -n "$file_matching_commits" ]; then
  echo "Found commits affecting the specified files: Src.java and Tst.java"
else
  echo "Error : No commits found affecting the specified files : Src.java and Tst.java"
  exit 1
fi
