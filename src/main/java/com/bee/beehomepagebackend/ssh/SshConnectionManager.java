//package com.bee.beehomepagebackend;
//
//import net.schmizz.sshj.SSHClient;
//import net.schmizz.sshj.connection.channel.direct.LocalPortForwarder;
//import net.schmizz.sshj.connection.channel.direct.Parameters;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.ServerSocket;
//
//@Component
//public class SshConnectionManager {
//
//    @Value("${ssh.user}")
//    private String user;
//
//    @Value("${ssh.host}")
//    private String host;
//
//    @Value("${ssh.port}")
//    private int port;
//
//    @Value("${ssh.privateKeyPath}")
//    private String privateKeyPath;
//
//    @Value("${ssh.localHost}")
//    private String localHost;
//
//    @Value("${ssh.remoteHost}")
//    private String remoteHost;
//
//    @Value("${ssh.localPort}")
//    private int localPort;
//
//    @Value("${ssh.remotePort}")
//    private int remotePort;
//
//
//    // SSH 연결 및 포트 포워딩 설정
//    public void connect() throws IOException {
//
//        SSHClient sshClient = new SSHClient();
//        ServerSocket serverSocket = null;
//
//        try {
//            sshClient.connect(host, port);
//
//            // SSH 키를 사용하여 인증
//            sshClient.authPublickey(user, privateKeyPath);
//
//            // 로컬 포트포워딩을 위한 객체 생성
//            serverSocket = new ServerSocket(localPort);
//            Parameters parameters = new Parameters(localHost, localPort, remoteHost, remotePort);
//
//            // 로컬 포트 포워딩 설정 (로컬 포트 -> 원격 DB)
//            LocalPortForwarder localPortForwarder = sshClient.newLocalPortForwarder(parameters, serverSocket);
//            System.out.println("SSH 연결 및 포트 포워딩 성공");
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        } finally {
//
//            try {
//                // 서버 종료 전 연결 종료
//                if (serverSocket != null) {
//                    serverSocket.close();
//                }
//                sshClient.disconnect();
//
//            } catch (IOException e) {
//
//                e.printStackTrace();
//
//            }
//        }
//    }
//}
