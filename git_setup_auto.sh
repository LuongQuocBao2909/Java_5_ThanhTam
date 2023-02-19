#!/bin/bash

function check_git(){
	check=`which -a git`
	if [[ -z $check ]]
	then
		echo "Git chua duoc cai dat!"
		return 0;
	else
		echo "Git da duoc cai dat trong may cua ban!"
		return 1;
	fi
}

function setup_user_remote(){
	read -p 'Name : ' name
	git config --global user.name $name 
	read -p 'Username : ' username
	git config --global user.username $username 
	read -p 'Password : ' password
	git config --global user.password $password 
	read -p 'Email : ' email
	git config --global user.email $email
	echo 'Thiet lap giao thuc ssh : '
	echo -e '1.Dau tien cac ban len trang github cua cac ban github.com sau do thuc hien cac buoc sau : \n
			Settings -> SSH and GPG keys -> New SSH key
		'
	echo -e '2.Tiep theo cac ban thuc hien cac buoc tiep theo va coppy file ben duoi them vao phan Key tren github \n'
	
	echo -e '3.Phan nay cac ban de trong va Enter khong nhap gi them : \n'
	ssh-keygen -t rsa

	echo -e 'Cac ban nhin tai dong : 
		Your public key has been saved in .../.ssh/id_rsa.pub\n
		Sau do truy cap vao file id_rsa.pub nay va coppy len tren github.com phan key cua minh.
	'
	
	echo -e '\nCompleted\n'
}

function push_code_to_remote(){
	git init
	git add .
	read -p 'Nhap commit name : ' cmt
	git commit -m "$cmt"
	
	git config -l
	echo -e 'Neu cac ban nhin thay duong dan repository cua minh xac nhan la chinh xac thi tiep tuc : \n
			Tai dong :  remote.origin.url= ... .git\n
		Neu khong co dong nay thi cac ban phai them 1 repository cua minh vao : \n
			1. Them repository
			2. Sua repository
			3. Khong thay doi
		'
	read -p 'Nhap lua chon cua ban : ' chose
	case $chose in
		
			1 )
				read -p 'Giao thuc ssh - Yeu cau nhap duong dan repository : ' url1
				git remote add origin $url1
				echo 'Completed'
			;;
			2 )
				read -p 'Giao thuc ssh - Yeu cau nhap duong dan repository : ' url2
				git remote set-url origin $url2
				echo 'Completed'
			;;
			*)
				echo 'Completed'
			;;
	esac
	read -p 'Giao thuc ssh - Yeu cau nhap nhanh ban muon push len : ' branch
	git branch -M $branch
	git push -u origin $branch
	echo 'Completed'
}

function menu(){
	x=-1
	
	while [ $x -eq -1 ]
	do
		echo 'Chao mung ban den voi chuong trinh cai dat git : '
		echo '1.Kiem tra git da duoc cai dat tren may chua'
		echo '2.Thiet lap user remote'
		echo '3.Push git len github'
		echo '0.Thoat'
		read -p 'Moi ban chon chuc nang can thuc hien : ' chose
		case $chose in
		
			1 )
				clear
				check_git
			;;
			2 )	
				clear
				setup_user_remote
			;;
			3 )	
				clear
				push_code_to_remote
			;;
			*)
				clear
				echo 'See you again!'
				x=0
			;;
		esac
	done
}
menu