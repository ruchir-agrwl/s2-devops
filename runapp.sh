echo 'Starting my app'
cd /home/ec2-user/cd-demo/target
chmod +x /home/ec2-user/cd-demo/target
echo 'permissions updated'
echo 'directory changed to target location'
java -jar s2-devops-0.0.1-SNAPSHOT.jar  >java-app.txt 2>&1 &