files=("src/Subtractor.java" "tst/SubtractorTest.java")

file_matching_commits=""

for file in "${files[@]}"; do
  file_commits=$(git log --all --pretty=format:"%H %s" -- "$file")

  if [ -n "$file_commits" ]; then
    file_matching_commits+="$file_commits"$'\n'
  fi
done

if [ -n "$file_matching_commits" ]; then
  echo "Found commits affecting the specified files: Subtractor.java and SubtractorTest.java"
else
  echo "Error : No commits found affecting the specified files : Subtractor.java and SubtractorTest.java"
  exit 1
fi
