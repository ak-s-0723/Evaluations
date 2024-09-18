files=("Triangle.java" "Circle.java")

file_matching_commits=""

for file in "${files[@]}"; do
  file_commits=$(git log --all --pretty=format:"%H %s" -- "$file")

  if [ -n "$file_commits" ]; then
    file_matching_commits+="$file_commits"$'\n'
  fi
done

if [ -n "$file_matching_commits" ]; then
  echo "Found commits affecting the specified files: Triangle.java and Circle.java"
else
  echo "Error : No commits found affecting the specified files : Triangle.java and Circle.java"
  exit 1
fi
