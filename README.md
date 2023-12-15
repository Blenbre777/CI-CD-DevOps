

Python 제작한 Chatbot 배포 
1. AWS EC2 서비스 접속을 위해 putty.exe 실행
    ubuntu@ip-###-##-#-##:~$ mkdir setup

2. 다운로드
   ubuntu@ip-###-##-#-##:~$ cd setup

   curl -O https://repo.anaconda.com/archive/Anaconda3-2021.04-Linux-x86_64.sh

3. 설치 
   ubuntu@ip-###-##-#-##:~/setup$ bash Anaconda3-2021.04-Linux-x86_64.sh

   설치시 모두 'yes' 권장

Python 설치 확인 및 가상환경 생성 
1. Python 설치 확인
   ubuntu@ip-###-##-#-##:~/setup$ python3 -V

2. 시스템 설정 파일 refresh
   ubuntu@ip-###-##-#-##:~/setup$ cd ..

   ubuntu@ip-###-##-#-##:~$ source .bashrc
   (base) ubuntu@ip-###-##-#-##:~$

3. 가상 환경 생성
   (base) ubuntu@ip-###-##-#-##:~$ conda create -n ai python=3.9 numpy scipy matplotlib pandas seaborn scikit-learn h5py

   
3-1 . conda 명령어 인식을 못할 경우 
   (base) ubuntu@ip-###-##-#-##:~$ export PATH=~/anaconda3/bin:$PATH
   source .bashrc

3-2 . 설치된 가상 환경 삭제 
  (base) C:\Users\dev>conda remove --name ai --all

4. 생성된 가상환경 확인
   (base) ubuntu@ip-###-##-#-##:~$ conda info --envs


Python 관련 package 설치 
1. 가상환경 변경
   (base) ubuntu@ip-###-##-#-##:~$ conda activate ai

2. Tensorflow
   (ai) ubuntu@ip-###-##-#-##:~$ pip install tensorflow==2.8.2
   (ai) ubuntu@ip-###-##-#-##:~$ pip show tensorflow

3. Django 
   (ai) ubuntu@ip-###-##-#-##:~$ pip install django==3.2.13
   (ai) ubuntu@ip-###-##-#-##:~$ pip show django

4. Django-cors-headers
   (ai) ubuntu@ip-###-##-#-##:~$ pip install django-cors-headers
   
6. OpenCV
   (ai) ubuntu@ip-###-##-#-##:~$ pip install opencv-python
7. pymysql
   (ai) ubuntu@ip-###-##-#-##:~$ pip install pymysql
8. konlpy
    (ai) ubuntu@ip-###-##-#-##:~$ pip install konlpy
