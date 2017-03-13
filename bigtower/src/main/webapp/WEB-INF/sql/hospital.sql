-- --------------------------------------------------------
-- 호스트:                          bluesang7.cafe24.com
-- 서버 버전:                        5.5.17-log - MySQL Community Server (GPL)
-- 서버 OS:                        Linux
-- HeidiSQL 버전:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- bluesang7 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `bluesang7` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bluesang7`;

-- 테이블 bluesang7.ho_blood_test 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_blood_test` (
  `HO_BLOOD_TEST_CODE` varchar(50) NOT NULL COMMENT '혈액검사코드',
  `HO_TEST_REQUEST_CODE` varchar(50) NOT NULL COMMENT '검사요청코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_BLOOD_TEST_PLATELET` int(11) DEFAULT NULL COMMENT '혈소판',
  `HO_BLOOD_TEST_SUGAR` int(11) DEFAULT NULL COMMENT '혈당',
  `HO_BLOOD_TEST_IMAGE_PATH` varchar(200) DEFAULT NULL COMMENT '혈액검사이미지경로',
  `HO_BLOOD_TEST_IMAGE_NAME` varchar(50) DEFAULT NULL COMMENT '혈액검사이미지이름',
  `HO_BLOOD_TEST_DATE` datetime NOT NULL COMMENT '혈액검사일',
  `HO_BLOOD_TEST_REGISTRATION_DATE` datetime DEFAULT NULL COMMENT '혈액검사결과등록일',
  `HO_GO_SENDSTATE` int(11) DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_BLOOD_TEST_CODE`),
  KEY `FK_ho_treatment_TO_ho_blood_test` (`HO_TREATMENT_CODE`),
  KEY `FK_ho_test_request_TO_ho_blood_test` (`HO_TEST_REQUEST_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='혈액검사';

-- 테이블 데이터 bluesang7.ho_blood_test:2 rows 내보내기
/*!40000 ALTER TABLE `ho_blood_test` DISABLE KEYS */;
INSERT INTO `ho_blood_test` (`HO_BLOOD_TEST_CODE`, `HO_TEST_REQUEST_CODE`, `HO_TREATMENT_CODE`, `HO_BLOOD_TEST_PLATELET`, `HO_BLOOD_TEST_SUGAR`, `HO_BLOOD_TEST_IMAGE_PATH`, `HO_BLOOD_TEST_IMAGE_NAME`, `HO_BLOOD_TEST_DATE`, `HO_BLOOD_TEST_REGISTRATION_DATE`, `HO_GO_SENDSTATE`) VALUES
	('bloodInspection_1', 'testrequest_1', 'treatment_1', 5, 5, '/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/blood/', '2d658247e6974c9c8ef5c944aebc1548.jpg', '2017-03-13 13:46:49', '2017-03-13 13:47:03', 1),
	('bloodInspection_2', 'testrequest_4', 'treatment_2', 6, 6, '/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/blood/', 'd91b1d0b854e4d069a485e4e9f336c8f.PNG', '2017-03-13 14:12:01', '2017-03-13 14:12:08', 1);
/*!40000 ALTER TABLE `ho_blood_test` ENABLE KEYS */;

-- 테이블 bluesang7.ho_chart 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_chart` (
  `HO_CHART_CODE` varchar(50) NOT NULL COMMENT '차트코드',
  `HO_PATIENT_CODE` varchar(50) NOT NULL COMMENT '환자ID',
  `HO_HOSPITAL_CODE` varchar(50) NOT NULL COMMENT '병원코드',
  `HO_CHART_REGISTRATION_DATE` datetime NOT NULL COMMENT '차트등록일',
  `HO_GO_SENDSTATE` int(11) DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_CHART_CODE`),
  KEY `FK_ho_patient_TO_ho_chart` (`HO_PATIENT_CODE`),
  KEY `FK_ho_hospital_TO_ho_chart` (`HO_HOSPITAL_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='차트';

-- 테이블 데이터 bluesang7.ho_chart:3 rows 내보내기
/*!40000 ALTER TABLE `ho_chart` DISABLE KEYS */;
INSERT INTO `ho_chart` (`HO_CHART_CODE`, `HO_PATIENT_CODE`, `HO_HOSPITAL_CODE`, `HO_CHART_REGISTRATION_DATE`, `HO_GO_SENDSTATE`) VALUES
	('hospital_2chart_3', 'patient_3', 'hospital_2', '2017-03-13 14:15:23', 1),
	('hospital_2chart_2', 'patient_2', 'hospital_2', '2017-03-13 14:10:11', 1),
	('hospital_1chart_1', 'patient_1', 'hospital_1', '2017-03-13 13:43:12', 1);
/*!40000 ALTER TABLE `ho_chart` ENABLE KEYS */;

-- 테이블 bluesang7.ho_checkup 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_checkup` (
  `HO_CHECKUP_CODE` varchar(50) NOT NULL COMMENT '건강검진코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_TEST_REQUEST_CODE` varchar(50) NOT NULL COMMENT '검사요청코드',
  `HO_CHECKUP_RESULT_NAME` varchar(50) DEFAULT NULL COMMENT '건강검진이미지이름',
  `HO_CHECKUP_RESULT_PATH` varchar(100) DEFAULT NULL COMMENT '건강검진이미지경로',
  `HO_CHECKUP_DATE` datetime NOT NULL COMMENT '건강검진일자',
  `HO_CHECKUP_REGISTRATION_DATE` datetime DEFAULT NULL COMMENT '건강검진결과등록일자',
  `HO_GO_SENDSTATE` int(11) NOT NULL DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_CHECKUP_CODE`),
  KEY `FK_ho_treatment_TO_ho_checkup` (`HO_TREATMENT_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='건강검진';

-- 테이블 데이터 bluesang7.ho_checkup:2 rows 내보내기
/*!40000 ALTER TABLE `ho_checkup` DISABLE KEYS */;
INSERT INTO `ho_checkup` (`HO_CHECKUP_CODE`, `HO_TREATMENT_CODE`, `HO_TEST_REQUEST_CODE`, `HO_CHECKUP_RESULT_NAME`, `HO_CHECKUP_RESULT_PATH`, `HO_CHECKUP_DATE`, `HO_CHECKUP_REGISTRATION_DATE`, `HO_GO_SENDSTATE`) VALUES
	('checkup_1', 'treatment_1', 'testrequest_3', '8868838d433241bc97eaf96b0c12baf1.tif', '/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/checkup/', '2017-03-13 13:48:23', '2017-03-13 13:48:32', 1),
	('checkup_2', 'treatment_2', 'testrequest_6', '2afe099fab924d4880c19d531041fdbb.jpg', '/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/checkup/', '2017-03-13 14:12:25', '2017-03-13 14:12:31', 1);
/*!40000 ALTER TABLE `ho_checkup` ENABLE KEYS */;

-- 테이블 bluesang7.ho_diagnosis 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_diagnosis` (
  `HO_DIAGNOSIS_CODE` varchar(50) NOT NULL COMMENT '진단코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_DISEASE_CODE` varchar(50) NOT NULL COMMENT '질병코드',
  `HO_DIAGNOSIS_WRITE_DATE` datetime DEFAULT NULL COMMENT '진단작성일',
  `HO_GO_SENDSTATE` int(11) DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_DIAGNOSIS_CODE`),
  KEY `FK_ho_disease_TO_ho_diagnosis` (`HO_DISEASE_CODE`),
  KEY `FK_ho_treatment_TO_ho_diagnosis` (`HO_TREATMENT_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='병원진단';

-- 테이블 데이터 bluesang7.ho_diagnosis:5 rows 내보내기
/*!40000 ALTER TABLE `ho_diagnosis` DISABLE KEYS */;
INSERT INTO `ho_diagnosis` (`HO_DIAGNOSIS_CODE`, `HO_TREATMENT_CODE`, `HO_DISEASE_CODE`, `HO_DIAGNOSIS_WRITE_DATE`, `HO_GO_SENDSTATE`) VALUES
	('diagnosis_5', 'treatment_4', 'A000', '2017-03-13 15:04:13', 1),
	('diagnosis_4', 'treatment_3', 'A001', '2017-03-13 14:15:38', 1),
	('diagnosis_3', 'treatment_2', 'A01', '2017-03-13 14:10:38', 1),
	('diagnosis_2', 'treatment_1', 'A009', '2017-03-13 13:43:50', 1),
	('diagnosis_1', 'treatment_1', 'A011', '2017-03-13 13:43:50', 1);
/*!40000 ALTER TABLE `ho_diagnosis` ENABLE KEYS */;

-- 테이블 bluesang7.ho_doctor 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_doctor` (
  `HO_DOCTOR_ID` varchar(10) NOT NULL COMMENT '의사ID',
  `HO_HOSPITAL_CODE` varchar(10) NOT NULL COMMENT '병원코드',
  `HO_TREAT_SUBJECT_CODE` varchar(10) NOT NULL COMMENT '진료과목코드',
  `HO_DOCTOR_SERIAL_NO` varchar(50) NOT NULL COMMENT '주민번호',
  `HO_DOCTOR_NAME` varchar(50) NOT NULL COMMENT '이름',
  `HO_DOCTOR_LICENSE` varchar(50) NOT NULL COMMENT '의사면허',
  `HO_DOCTOR_PHONE` varchar(50) NOT NULL COMMENT '연락처',
  `HO_DOCTOR_ZIPCODE` varchar(50) NOT NULL COMMENT '우편번호',
  `HO_DOCTOR_ADDRESS` varchar(50) NOT NULL COMMENT '주소',
  `HO_DOCTOR_DETAIL_ADDRESS` varchar(50) NOT NULL COMMENT '상세주소',
  PRIMARY KEY (`HO_DOCTOR_ID`),
  KEY `FK_ho_hospital_TO_ho_doctor` (`HO_HOSPITAL_CODE`),
  KEY `FK_ho_treat_subject_TO_ho_doctor` (`HO_TREAT_SUBJECT_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='병원의사관리';

-- 테이블 데이터 bluesang7.ho_doctor:5 rows 내보내기
/*!40000 ALTER TABLE `ho_doctor` DISABLE KEYS */;
INSERT INTO `ho_doctor` (`HO_DOCTOR_ID`, `HO_HOSPITAL_CODE`, `HO_TREAT_SUBJECT_CODE`, `HO_DOCTOR_SERIAL_NO`, `HO_DOCTOR_NAME`, `HO_DOCTOR_LICENSE`, `HO_DOCTOR_PHONE`, `HO_DOCTOR_ZIPCODE`, `HO_DOCTOR_ADDRESS`, `HO_DOCTOR_DETAIL_ADDRESS`) VALUES
	('doctor_1', 'hospital_1', '13', '820121-1234567', '조민국', '106435', '010-2000-3000', '123-456', '전라북도 전주시 완산구 백제대로 12 ', '123-456번지'),
	('doctor_2', 'hospital_2', '15', '740111-1234567', '최유민', '123423', '010-9000-1111', '123-987', '전라북도 전주시 덕진구 기린로 12', '456-789번지'),
	('doctor_3', 'hospital_3', '2', '891001-1234567', '윤재호', '115642', '010-8000-1111', '123-987', '전라북도 전주시 완산구 백제대로 80', '456-789번지'),
	('doctor_4', 'hospital_4', '1', '840615-1234567', '고은비', '136542', '010-7000-1111', '123-987', '전라북도 전주시 완산구 백제대로 85', '456-789번지'),
	('doctor_5', 'hospital_5', '01', '800325-1234567', '허준', '100213', '010-6000-1111', '123-987', '전라북도 전주시 덕진구 기린로 95', '456-789번지');
/*!40000 ALTER TABLE `ho_doctor` ENABLE KEYS */;

-- 테이블 bluesang7.ho_hospital 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_hospital` (
  `HO_HOSPITAL_CODE` varchar(10) NOT NULL COMMENT '병원코드',
  `HO_HOSPITAL_NAME` varchar(10) NOT NULL COMMENT '병원이름',
  `HO_HOSPITAL_SIZE` varchar(10) NOT NULL COMMENT '병원규모',
  `HO_ZIP_CODE` varchar(30) NOT NULL COMMENT '우편번호',
  `HO_HOSPITAL_ADDRESS` varchar(30) NOT NULL COMMENT '주소',
  `HO_HOSPITAL_PHONE` varchar(20) NOT NULL COMMENT '병원연락처',
  `HO_HOSPITAL_BUSINESSNUMBER` varchar(20) NOT NULL COMMENT '병원사업자번호',
  PRIMARY KEY (`HO_HOSPITAL_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='병원';

-- 테이블 데이터 bluesang7.ho_hospital:5 rows 내보내기
/*!40000 ALTER TABLE `ho_hospital` DISABLE KEYS */;
INSERT INTO `ho_hospital` (`HO_HOSPITAL_CODE`, `HO_HOSPITAL_NAME`, `HO_HOSPITAL_SIZE`, `HO_ZIP_CODE`, `HO_HOSPITAL_ADDRESS`, `HO_HOSPITAL_PHONE`, `HO_HOSPITAL_BUSINESSNUMBER`) VALUES
	('hospital_1', '예수병원', '준종합병원', '123-456', '서원로 365', '063-230-8114', '401-123-45678'),
	('hospital_2', '본병원', '2차병원', '123-567', '유연로 276', '063-220-0300', '401-123-98765'),
	('hospital_3', '전주병원', '2차병원', '123-678', '한두평3길 13', '063-220-7200', '401-123-76543'),
	('hospital_4', '전북대병원', '종합병원', '123-987', '건지로 20', '063-250-1114', '401-123-87654'),
	('hospital_5', '신기독병원', '2차병원', '123-876', '거마평로 185', '063-220-7000', '401-123-65432');
/*!40000 ALTER TABLE `ho_hospital` ENABLE KEYS */;

-- 테이블 bluesang7.ho_hospitalization 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_hospitalization` (
  `HO_HOSPITALIZATION_CODE` varchar(50) NOT NULL COMMENT '입원코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_HOSPITALIZATION_STATE_CODE` int(10) NOT NULL COMMENT '상태코드',
  `HO_HOSPITALIZATION_REQUEST_CODE` varchar(50) NOT NULL COMMENT '입퇴원요청코드',
  `HO_HOSPITALIZATION_START_DATE` datetime NOT NULL COMMENT '입원일',
  `HO_HOSPITALIZATION_END_DATE` datetime DEFAULT NULL COMMENT '퇴원일',
  `HO_GO_SENDSTATE` int(11) NOT NULL DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_HOSPITALIZATION_CODE`),
  KEY `FK_ho_treatment_TO_ho_hospitalization` (`HO_TREATMENT_CODE`),
  KEY `HO_HOSPITALIZATION_STATE_CODE` (`HO_HOSPITALIZATION_STATE_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='병원입퇴원';

-- 테이블 데이터 bluesang7.ho_hospitalization:3 rows 내보내기
/*!40000 ALTER TABLE `ho_hospitalization` DISABLE KEYS */;
INSERT INTO `ho_hospitalization` (`HO_HOSPITALIZATION_CODE`, `HO_TREATMENT_CODE`, `HO_HOSPITALIZATION_STATE_CODE`, `HO_HOSPITALIZATION_REQUEST_CODE`, `HO_HOSPITALIZATION_START_DATE`, `HO_HOSPITALIZATION_END_DATE`, `HO_GO_SENDSTATE`) VALUES
	('hospitalization_2', 'treatment_2', 3, 'hospitalization_request_2', '2017-03-13 14:12:36', '2017-03-13 14:12:37', 1),
	('hospitalization_1', 'treatment_1', 3, 'hospitalization_request_1', '2017-03-13 13:48:55', '2017-03-13 13:49:07', 1),
	('hospitalization_3', 'treatment_3', 3, 'hospitalization_request_3', '2017-03-13 14:15:42', '2017-03-13 14:16:02', 1);
/*!40000 ALTER TABLE `ho_hospitalization` ENABLE KEYS */;

-- 테이블 bluesang7.ho_hospitalization_request 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_hospitalization_request` (
  `HO_HOSPITALIZATION_REQUEST_CODE` varchar(50) NOT NULL COMMENT '입/퇴원 요청코드',
  `HO_HOSPITALIZATION_STATE_CODE` int(10) DEFAULT NULL COMMENT '상태코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_HOSPITALIZATION_REQUEST_DATE` datetime NOT NULL COMMENT '입/퇴원 요청일',
  PRIMARY KEY (`HO_HOSPITALIZATION_REQUEST_CODE`),
  KEY `HO_HOSPITALIZATION_STATE_CODE` (`HO_HOSPITALIZATION_STATE_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='입/퇴원요청';

-- 테이블 데이터 bluesang7.ho_hospitalization_request:3 rows 내보내기
/*!40000 ALTER TABLE `ho_hospitalization_request` DISABLE KEYS */;
INSERT INTO `ho_hospitalization_request` (`HO_HOSPITALIZATION_REQUEST_CODE`, `HO_HOSPITALIZATION_STATE_CODE`, `HO_TREATMENT_CODE`, `HO_HOSPITALIZATION_REQUEST_DATE`) VALUES
	('hospitalization_request_1', 2, 'treatment_1', '2017-03-13 13:43:50'),
	('hospitalization_request_2', 2, 'treatment_2', '2017-03-13 14:10:38'),
	('hospitalization_request_3', 2, 'treatment_3', '2017-03-13 14:15:38');
/*!40000 ALTER TABLE `ho_hospitalization_request` ENABLE KEYS */;

-- 테이블 bluesang7.ho_hospitalization_state 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_hospitalization_state` (
  `HO_HOSPITALIZATION_STATE_CODE` int(11) NOT NULL COMMENT '입원상태코드',
  `HO_HOSPITALIZATION_STATE_NAME` varchar(50) NOT NULL COMMENT '입원상태명',
  PRIMARY KEY (`HO_HOSPITALIZATION_STATE_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='입/퇴원상태';

-- 테이블 데이터 bluesang7.ho_hospitalization_state:4 rows 내보내기
/*!40000 ALTER TABLE `ho_hospitalization_state` DISABLE KEYS */;
INSERT INTO `ho_hospitalization_state` (`HO_HOSPITALIZATION_STATE_CODE`, `HO_HOSPITALIZATION_STATE_NAME`) VALUES
	(1, '입원요청'),
	(2, '입원중'),
	(3, '퇴원완료'),
	(4, '해당없음');
/*!40000 ALTER TABLE `ho_hospitalization_state` ENABLE KEYS */;

-- 테이블 bluesang7.ho_media_test 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_media_test` (
  `HO_MEDIA_TEST_CODE` varchar(50) NOT NULL COMMENT '영상검사코드',
  `HO_TEST_REQUEST_CODE` varchar(50) NOT NULL COMMENT '검사요청코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_MEDIA_TEST_IMAGE_PATH` varchar(200) DEFAULT NULL COMMENT '영상검사이미지경로',
  `HO_MEDIA_TEST_IMAGE_NAME` varchar(200) DEFAULT NULL COMMENT '영상검사이미지명',
  `HO_MEDIA_TEST_DATE` datetime NOT NULL COMMENT '영상검사일',
  `HO_MEDIA_TEST_REGISTRATION_DATE` datetime DEFAULT NULL COMMENT '영상검사결과등록일',
  `HO_GO_SENDSTATE` int(11) NOT NULL DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_MEDIA_TEST_CODE`),
  KEY `FK_ho_treatment_TO_ho_media_test` (`HO_TREATMENT_CODE`),
  KEY `FK_ho_test_request_TO_ho_media_test` (`HO_TEST_REQUEST_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='영상검사';

-- 테이블 데이터 bluesang7.ho_media_test:2 rows 내보내기
/*!40000 ALTER TABLE `ho_media_test` DISABLE KEYS */;
INSERT INTO `ho_media_test` (`HO_MEDIA_TEST_CODE`, `HO_TEST_REQUEST_CODE`, `HO_TREATMENT_CODE`, `HO_MEDIA_TEST_IMAGE_PATH`, `HO_MEDIA_TEST_IMAGE_NAME`, `HO_MEDIA_TEST_DATE`, `HO_MEDIA_TEST_REGISTRATION_DATE`, `HO_GO_SENDSTATE`) VALUES
	('videoInspection_1', 'testrequest_2', 'treatment_1', '/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/image/', '8b21499b57ea354154594d259a761f7dc6ed.jpg', '2017-03-13 13:47:48', '2017-03-13 13:48:06', 1),
	('videoInspection_2', 'testrequest_5', 'treatment_2', '/home/hosting_users/bluesang7/tomcat/webapps/bigtower/resources/file/image/', '85c5b3165645e549f45bd825a42e6c882348.jpg', '2017-03-13 14:12:13', '2017-03-13 14:12:18', 1);
/*!40000 ALTER TABLE `ho_media_test` ENABLE KEYS */;

-- 테이블 bluesang7.ho_operation 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_operation` (
  `HO_OPERATION_CODE` varchar(50) NOT NULL COMMENT '수술코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_OPERATION_TYPE_CODE` varchar(50) NOT NULL COMMENT '수술명코드',
  `HO_OPERATION_DIARY` varchar(20000) DEFAULT NULL COMMENT '수술일지',
  `HO_OPERATION_START_DATE` datetime NOT NULL COMMENT '수술시작일시',
  `HO_OPERATION_END_DATE` datetime DEFAULT NULL COMMENT '수술종료일시',
  `HO_GO_SENDSTATE` int(11) DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_OPERATION_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='수술';

-- 테이블 데이터 bluesang7.ho_operation:2 rows 내보내기
/*!40000 ALTER TABLE `ho_operation` DISABLE KEYS */;
INSERT INTO `ho_operation` (`HO_OPERATION_CODE`, `HO_TREATMENT_CODE`, `HO_OPERATION_TYPE_CODE`, `HO_OPERATION_DIARY`, `HO_OPERATION_START_DATE`, `HO_OPERATION_END_DATE`, `HO_GO_SENDSTATE`) VALUES
	('operation_2', 'treatment_2', 'C8534', '포경수술', '2017-03-14 00:00:00', '2017-03-14 00:00:00', 1),
	('operation_1', 'treatment_1', 'C8535', '수술배째', '2017-03-14 00:00:00', '2017-03-14 00:00:00', 1);
/*!40000 ALTER TABLE `ho_operation` ENABLE KEYS */;

-- 테이블 bluesang7.ho_patient 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_patient` (
  `HO_PATIENT_CODE` varchar(20) NOT NULL COMMENT '환자코드',
  `HO_HOSPITAL_CODE` varchar(10) NOT NULL COMMENT '병원코드',
  `HO_CITIZEN_ID` varchar(14) NOT NULL COMMENT '국민ID',
  `HO_PATIENT_NAME` varchar(10) NOT NULL COMMENT '환자이름',
  `HO_PATIENT_PHONE` varchar(20) NOT NULL COMMENT '환자연락처',
  `HO_ZIP_CODE` varchar(30) NOT NULL COMMENT '우편번호',
  `HO_PATIENT_ADDRESS` varchar(50) NOT NULL COMMENT '주소',
  `HO_PATIENT_DETAIL_ADDRESS` varchar(20) NOT NULL COMMENT '상세주소',
  PRIMARY KEY (`HO_PATIENT_CODE`),
  KEY `FK_ho_hospital_TO_ho_patient` (`HO_HOSPITAL_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='환자관리';

-- 테이블 데이터 bluesang7.ho_patient:3 rows 내보내기
/*!40000 ALTER TABLE `ho_patient` DISABLE KEYS */;
INSERT INTO `ho_patient` (`HO_PATIENT_CODE`, `HO_HOSPITAL_CODE`, `HO_CITIZEN_ID`, `HO_PATIENT_NAME`, `HO_PATIENT_PHONE`, `HO_ZIP_CODE`, `HO_PATIENT_ADDRESS`, `HO_PATIENT_DETAIL_ADDRESS`) VALUES
	('patient_1', 'hospital_1', '900101-1000001', '도우너', '010-1234-5678', '05239', '서울 강동구 고덕로 19 (암사동)', 'dd'),
	('patient_2', 'hospital_2', '900101-1000001', '도우너', '010-1234-5678', '06027', '서울 강남구 압구정로 102 (신사동, 형지제2빌딩)', 'd'),
	('patient_3', 'hospital_2', '900101-1000002', '최순이', '010-1234-5678', '08861', '서울 관악구 난곡로 30 (신림동, 관악산휴먼시아아파트)', 'ㄴ11');
/*!40000 ALTER TABLE `ho_patient` ENABLE KEYS */;

-- 테이블 bluesang7.ho_prescription 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_prescription` (
  `HO_PRESCRIPTION_CODE` varchar(50) NOT NULL COMMENT '처방코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_MEDICINE_CODE` varchar(50) NOT NULL COMMENT '투약코드',
  `HO_PRESCRIPTION_DAILYDOSE` varchar(50) NOT NULL COMMENT '일회투약량',
  `HO_PRESCRIPTION_DAILYCOUNT` varchar(50) NOT NULL COMMENT '일일투약횟수',
  `HO_PRESCRIPTION_TOTALDAY` varchar(50) NOT NULL COMMENT '총투약일수',
  `HO_PRESCRIPTION_USAGE` varchar(50) NOT NULL COMMENT '용법',
  `HO_PRESCRIPTION_WRITE` datetime NOT NULL COMMENT '처방전작성일',
  `HO_GO_SENDSTATE` int(11) DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_PRESCRIPTION_CODE`),
  KEY `FK_ho_medicine_TO_ho_prescription` (`HO_MEDICINE_CODE`),
  KEY `FK_ho_treatment_TO_ho_prescription` (`HO_TREATMENT_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='처방';

-- 테이블 데이터 bluesang7.ho_prescription:3 rows 내보내기
/*!40000 ALTER TABLE `ho_prescription` DISABLE KEYS */;
INSERT INTO `ho_prescription` (`HO_PRESCRIPTION_CODE`, `HO_TREATMENT_CODE`, `HO_MEDICINE_CODE`, `HO_PRESCRIPTION_DAILYDOSE`, `HO_PRESCRIPTION_DAILYCOUNT`, `HO_PRESCRIPTION_TOTALDAY`, `HO_PRESCRIPTION_USAGE`, `HO_PRESCRIPTION_WRITE`, `HO_GO_SENDSTATE`) VALUES
	('prescription_1', 'treatment_1', 'A02BA04', '1mg/일', '1회/일', '1일', '1', '2017-03-13 13:43:50', 1),
	('prescription_2', 'treatment_1', 'A02BA04', '2mg/일', '2회/일', '2일', '2', '2017-03-13 13:43:50', 1),
	('prescription_3', 'treatment_2', 'A02BA53', '5mg/일', '5회/일', '5일', '5', '2017-03-13 14:10:38', 1);
/*!40000 ALTER TABLE `ho_prescription` ENABLE KEYS */;

-- 테이블 bluesang7.ho_receive 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_receive` (
  `HO_RECEIVE_CODE` varchar(10) NOT NULL COMMENT '접수코드',
  `HO_HOSPITAL_CODE` varchar(10) NOT NULL COMMENT '병원코드',
  `HO_PATIENT_CODE` varchar(10) NOT NULL COMMENT '환자코드',
  `HO_STAFF_ID` varchar(10) NOT NULL COMMENT '의사ID',
  `HO_TREAT_SUBJECT_CODE` varchar(10) NOT NULL COMMENT '진료과목코드',
  `HO_RECEIVE_STATE_CODE` int(11) NOT NULL COMMENT '접수상태코드',
  `HO_TREATMENT_CODE` varchar(50) DEFAULT NULL COMMENT '진료코드',
  `HO_RECEIVE_PURPOSE` varchar(10) DEFAULT NULL COMMENT '접수목적',
  `HO_RECEIVE_REGISTRATION_DATE` datetime NOT NULL COMMENT '접수등록일시',
  `HO_RECEIVE_COMPLETE_DATE` datetime DEFAULT NULL COMMENT '수납완료일시',
  PRIMARY KEY (`HO_RECEIVE_CODE`),
  KEY `FK_ho_patient_TO_ho_receive` (`HO_PATIENT_CODE`),
  KEY `FK_ho_staff_TO_ho_receive` (`HO_STAFF_ID`),
  KEY `FK_ho_treat_subject_TO_ho_receive` (`HO_TREAT_SUBJECT_CODE`),
  KEY `FK_ho_hospital_TO_ho_receive` (`HO_HOSPITAL_CODE`),
  KEY `FK_ho_receive_state_TO_ho_receive` (`HO_RECEIVE_STATE_CODE`),
  KEY `HO_TREATMENT_CODE` (`HO_TREATMENT_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='접수';

-- 테이블 데이터 bluesang7.ho_receive:6 rows 내보내기
/*!40000 ALTER TABLE `ho_receive` DISABLE KEYS */;
INSERT INTO `ho_receive` (`HO_RECEIVE_CODE`, `HO_HOSPITAL_CODE`, `HO_PATIENT_CODE`, `HO_STAFF_ID`, `HO_TREAT_SUBJECT_CODE`, `HO_RECEIVE_STATE_CODE`, `HO_TREATMENT_CODE`, `HO_RECEIVE_PURPOSE`, `HO_RECEIVE_REGISTRATION_DATE`, `HO_RECEIVE_COMPLETE_DATE`) VALUES
	('receive_6', 'hospital_1', 'patient_1', 'id001', '18', 2, 'treatment_6', '감기몸살', '2017-03-13 17:22:05', NULL),
	('receive_5', 'hospital_1', 'patient_1', 'id001', '17', 2, 'treatment_5', '감기몸살', '2017-03-13 17:02:29', NULL),
	('receive_2', 'hospital_2', 'patient_2', 'id005', '2', 3, 'treatment_2', '감기몸살', '2017-03-13 14:10:13', NULL),
	('receive_3', 'hospital_2', 'patient_3', 'id005', '1', 3, 'treatment_3', '감기몸살', '2017-03-13 14:15:26', NULL),
	('receive_4', 'hospital_1', 'patient_1', 'id001', '2', 3, 'treatment_4', '감기몸살', '2017-03-13 15:04:03', NULL),
	('receive_1', 'hospital_1', 'patient_1', 'id001', '2', 4, 'treatment_1', '감기몸살', '2017-03-13 13:43:14', NULL);
/*!40000 ALTER TABLE `ho_receive` ENABLE KEYS */;

-- 테이블 bluesang7.ho_receive_state 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_receive_state` (
  `HO_RECEIVE_STATE_CODE` int(11) NOT NULL COMMENT '접수상태코드',
  `HO_RECEIVE_STATE_NAME` varchar(10) NOT NULL COMMENT '접수상태명',
  PRIMARY KEY (`HO_RECEIVE_STATE_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='접수상태';

-- 테이블 데이터 bluesang7.ho_receive_state:4 rows 내보내기
/*!40000 ALTER TABLE `ho_receive_state` DISABLE KEYS */;
INSERT INTO `ho_receive_state` (`HO_RECEIVE_STATE_CODE`, `HO_RECEIVE_STATE_NAME`) VALUES
	(1, '접수완료'),
	(2, '진료'),
	(3, '수납대기'),
	(4, '수납완료');
/*!40000 ALTER TABLE `ho_receive_state` ENABLE KEYS */;

-- 테이블 bluesang7.ho_staff 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_staff` (
  `HO_STAFF_ID` varchar(10) NOT NULL COMMENT '직원ID',
  `HO_HOSPITAL_CODE` varchar(10) NOT NULL COMMENT '병원코드',
  `STAFF_LEVEL_CODE` int(11) NOT NULL COMMENT '권한코드',
  `HO_STAFF_PW` varchar(50) NOT NULL COMMENT '직원PW',
  `HO_STAFF_SERIAL_NO` varchar(50) NOT NULL COMMENT '주민번호',
  `HO_STAFF_NAME` varchar(50) NOT NULL COMMENT '이름',
  `HO_STAFF_PHONE` varchar(50) NOT NULL COMMENT '연락처',
  `HO_ZIP_CODE` varchar(30) NOT NULL COMMENT '우편번호',
  `HO_STAFF_ADDRESS` varchar(30) NOT NULL COMMENT '주소',
  `HO_STAFF_DETAIL_ADDRESS` varchar(20) NOT NULL COMMENT '상세주소',
  PRIMARY KEY (`HO_STAFF_ID`),
  KEY `FK_ho_hospital_TO_ho_staff` (`HO_HOSPITAL_CODE`),
  KEY `FK_ho_staff_level_TO_ho_staff` (`STAFF_LEVEL_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='직원관리';

-- 테이블 데이터 bluesang7.ho_staff:20 rows 내보내기
/*!40000 ALTER TABLE `ho_staff` DISABLE KEYS */;
INSERT INTO `ho_staff` (`HO_STAFF_ID`, `HO_HOSPITAL_CODE`, `STAFF_LEVEL_CODE`, `HO_STAFF_PW`, `HO_STAFF_SERIAL_NO`, `HO_STAFF_NAME`, `HO_STAFF_PHONE`, `HO_ZIP_CODE`, `HO_STAFF_ADDRESS`, `HO_STAFF_DETAIL_ADDRESS`) VALUES
	('id001', 'hospital_1', 1, 'pw001', '900123-1234567', '조민국', '010-1234-5678', '123-456', '백제대로 12', '456번지'),
	('id002', 'hospital_1', 2, 'pw002', '900421-1234567', '김진남', '010-1234-5678', '123-987', '기린로 12', '123번지'),
	('id003', 'hospital_1', 3, 'pw003', '900123-1234567', '조봉연', '01012345678', '123-456', '백제대로 13', '123번지'),
	('id004', 'hospital_1', 4, 'pw004', '900123-1234567', '김의진', '01012345678', '123-456', '백제대로 14', '124번지'),
	('id005', 'hospital_2', 1, 'pw005', '900123-1234567', '최유민', '01012345678', '123-456', '백제대로 15', '125번지'),
	('id006', 'hospital_2', 2, 'pw006', '900123-1234567', '정상일', '01012345678', '123-456', '백제대로 16', '126번지'),
	('id007', 'hospital_2', 3, 'pw007', '900123-1234567', '김정빈', '01012345678', '123-456', '백제대로 17', '127번지'),
	('id008', 'hospital_2', 4, 'pw008', '900123-1234567', '홍수아', '01012345678', '123-456', '백제대로 18', '128번지'),
	('id009', 'hospital_3', 1, 'pw009', '900123-1234567', '윤재호', '01012345678', '123-456', '백제대로 19', '129번지'),
	('id010', 'hospital_3', 2, 'pw010', '900123-1234567', '홍인용', '01012345678', '123-456', '백제대로 20', '130번지'),
	('id011', 'hospital_3', 3, 'pw011', '900123-1234567', '이명철', '01012345678', '123-456', '백제대로 21', '131번지'),
	('id012', 'hospital_3', 4, 'pw012', '900123-1234567', '방상엽', '01012345678', '123-456', '백제대로 22', '132번지'),
	('id013', 'hospital_4', 1, 'pw013', '900123-1234567', '고은비', '01012345678', '123-456', '백제대로 23', '133번지'),
	('id014', 'hospital_4', 2, 'pw014', '900123-1234567', '황문규', '01012345678', '123-456', '백제대로 24', '134번지'),
	('id015', 'hospital_4', 3, 'pw015', '900123-1234567', '임문환', '01012345678', '123-456', '백제대로 25', '135번지'),
	('id016', 'hospital_4', 4, 'pw016', '900123-1234567', '김의현', '01012345678', '123-456', '백제대로 26', '136번지'),
	('id017', 'hospital_5', 1, 'pw017', '900123-1234567', '허준', '01012345678', '123-456', '백제대로 27', '137번지'),
	('id018', 'hospital_5', 2, 'pw018', '900123-1234567', '이형열', '01012345678', '123-456', '백제대로 28', '138번지'),
	('id019', 'hospital_5', 3, 'pw019', '900123-1234567', '박성환', '01012345678', '123-456', '백제대로 29', '139번지'),
	('id020', 'hospital_5', 4, 'pw020', '900123-1234567', '홍길동', '01012345678', '123-456', '백제대로 30', '140번지');
/*!40000 ALTER TABLE `ho_staff` ENABLE KEYS */;

-- 테이블 bluesang7.ho_staff_level 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_staff_level` (
  `STAFF_LEVEL_CODE` int(11) NOT NULL COMMENT '권한코드',
  `STAFF_LEVEL_NAME` varchar(10) NOT NULL COMMENT '권한명',
  PRIMARY KEY (`STAFF_LEVEL_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='권한';

-- 테이블 데이터 bluesang7.ho_staff_level:4 rows 내보내기
/*!40000 ALTER TABLE `ho_staff_level` DISABLE KEYS */;
INSERT INTO `ho_staff_level` (`STAFF_LEVEL_CODE`, `STAFF_LEVEL_NAME`) VALUES
	(1, '의사'),
	(2, '간호사'),
	(3, '원무과'),
	(4, '검사실');
/*!40000 ALTER TABLE `ho_staff_level` ENABLE KEYS */;

-- 테이블 bluesang7.ho_test 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_test` (
  `HO_TEST_CODE` varchar(10) NOT NULL COMMENT '검사코드',
  `HO_TEST_NAME` varchar(10) NOT NULL COMMENT '검사명',
  PRIMARY KEY (`HO_TEST_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='검사명';

-- 테이블 데이터 bluesang7.ho_test:3 rows 내보내기
/*!40000 ALTER TABLE `ho_test` DISABLE KEYS */;
INSERT INTO `ho_test` (`HO_TEST_CODE`, `HO_TEST_NAME`) VALUES
	('1', '혈액검사'),
	('2', '영상검사'),
	('3', '건강검진');
/*!40000 ALTER TABLE `ho_test` ENABLE KEYS */;

-- 테이블 bluesang7.ho_test_request 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_test_request` (
  `HO_TEST_REQUEST_CODE` varchar(50) NOT NULL COMMENT '검사요청코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_TEST_CODE` varchar(50) NOT NULL COMMENT '검사코드',
  `HO_TEST_STATE_CODE` int(11) DEFAULT '1' COMMENT '검사상태코드',
  `HO_TEST_START_DATE` datetime DEFAULT NULL COMMENT '검사시작일',
  `HO_TEST_END_DATE` datetime DEFAULT NULL COMMENT '검사종료일',
  PRIMARY KEY (`HO_TEST_REQUEST_CODE`),
  KEY `FK_ho_test_TO_ho_test_request` (`HO_TEST_CODE`),
  KEY `FK_ho_treatment_TO_ho_test_request` (`HO_TREATMENT_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='검사요청';

-- 테이블 데이터 bluesang7.ho_test_request:7 rows 내보내기
/*!40000 ALTER TABLE `ho_test_request` DISABLE KEYS */;
INSERT INTO `ho_test_request` (`HO_TEST_REQUEST_CODE`, `HO_TREATMENT_CODE`, `HO_TEST_CODE`, `HO_TEST_STATE_CODE`, `HO_TEST_START_DATE`, `HO_TEST_END_DATE`) VALUES
	('testrequest_7', 'treatment_4', '1', 2, '2017-03-13 15:04:29', NULL),
	('testrequest_6', 'treatment_2', '3', 3, '2017-03-13 14:12:24', '2017-03-13 14:12:25'),
	('testrequest_5', 'treatment_2', '2', 3, '2017-03-13 14:12:12', '2017-03-13 14:12:13'),
	('testrequest_4', 'treatment_2', '1', 3, '2017-03-13 14:11:58', '2017-03-13 14:12:01'),
	('testrequest_2', 'treatment_1', '2', 3, '2017-03-13 13:47:47', '2017-03-13 13:47:48'),
	('testrequest_3', 'treatment_1', '3', 3, '2017-03-13 13:48:23', '2017-03-13 13:48:23'),
	('testrequest_1', 'treatment_1', '1', 3, '2017-03-13 13:46:47', '2017-03-13 13:46:49');
/*!40000 ALTER TABLE `ho_test_request` ENABLE KEYS */;

-- 테이블 bluesang7.ho_test_state 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_test_state` (
  `HO_TEST_STATE_CODE` int(11) NOT NULL COMMENT '검사진행상태코드',
  `HO_TEST_STATE_NAME` varchar(10) NOT NULL COMMENT '검사진행상태',
  PRIMARY KEY (`HO_TEST_STATE_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='검사진행상태';

-- 테이블 데이터 bluesang7.ho_test_state:3 rows 내보내기
/*!40000 ALTER TABLE `ho_test_state` DISABLE KEYS */;
INSERT INTO `ho_test_state` (`HO_TEST_STATE_CODE`, `HO_TEST_STATE_NAME`) VALUES
	(1, '검사대기'),
	(2, '검사결과대기'),
	(3, '검사결과등록');
/*!40000 ALTER TABLE `ho_test_state` ENABLE KEYS */;

-- 테이블 bluesang7.ho_treatment 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_treatment` (
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_DOCTOR_ID` varchar(50) NOT NULL COMMENT '의사ID',
  `HO_HOSPITALIZATION_STATE_CODE` varchar(50) NOT NULL COMMENT '입퇴원상태코드',
  `HO_CHART_CODE` varchar(50) NOT NULL COMMENT '차트코드',
  `HO_PATIENT_CODE` varchar(50) NOT NULL COMMENT '환자ID',
  `HO_HOSPITAL_CODE` varchar(50) NOT NULL COMMENT '병원코드',
  `HO_TREAT_SUBJECT_CODE` varchar(50) NOT NULL COMMENT '진료과목코드',
  `HO_TREATMENT_CONTENTS` varchar(50) DEFAULT NULL COMMENT '진료내용',
  `HO_TREATMENT_WRITE_DATE` datetime DEFAULT NULL COMMENT '진료작성일',
  `HO_GO_SENDSTATE` int(11) DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_TREATMENT_CODE`),
  KEY `FK_ho_patient_TO_ho_treatment` (`HO_PATIENT_CODE`),
  KEY `FK_ho_hospital_TO_ho_treatment` (`HO_HOSPITAL_CODE`),
  KEY `FK_ho_chart_TO_ho_treatment` (`HO_CHART_CODE`),
  KEY `FK_ho_treat_subject_TO_ho_treatment` (`HO_TREAT_SUBJECT_CODE`),
  KEY `FK_ho_doctor_TO_ho_treatment` (`HO_DOCTOR_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='병원진료';

-- 테이블 데이터 bluesang7.ho_treatment:6 rows 내보내기
/*!40000 ALTER TABLE `ho_treatment` DISABLE KEYS */;
INSERT INTO `ho_treatment` (`HO_TREATMENT_CODE`, `HO_DOCTOR_ID`, `HO_HOSPITALIZATION_STATE_CODE`, `HO_CHART_CODE`, `HO_PATIENT_CODE`, `HO_HOSPITAL_CODE`, `HO_TREAT_SUBJECT_CODE`, `HO_TREATMENT_CONTENTS`, `HO_TREATMENT_WRITE_DATE`, `HO_GO_SENDSTATE`) VALUES
	('treatment_1', 'doctor_1', '5', 'hospital_1chart_1', 'patient_1', 'hospital_1', '2', 'd', '2017-03-13 13:43:15', 1),
	('treatment_2', 'doctor_2', '5', 'hospital_2chart_2', 'patient_2', 'hospital_2', '2', 'd', '2017-03-13 14:10:15', 1),
	('treatment_3', 'doctor_2', '5', 'hospital_2chart_3', 'patient_3', 'hospital_2', '1', 'ㅇㅇ', '2017-03-13 14:15:27', 1),
	('treatment_4', 'doctor_1', '5', 'hospital_1chart_1', 'patient_1', 'hospital_1', '2', 'd', '2017-03-13 15:04:04', 1),
	('treatment_5', 'doctor_1', '5', 'hospital_1chart_1', 'patient_1', 'hospital_1', '17', NULL, '2017-03-13 17:02:39', 0),
	('treatment_6', 'doctor_1', '5', 'hospital_1chart_1', 'patient_1', 'hospital_1', '18', NULL, '2017-03-13 17:22:06', 0);
/*!40000 ALTER TABLE `ho_treatment` ENABLE KEYS */;

-- 테이블 bluesang7.ho_treat_subject 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_treat_subject` (
  `HO_TREAT_SUBJECT_CODE` varchar(10) NOT NULL COMMENT '진료과목코드',
  `HO_TREAT_SUBJECT_NAME` varchar(50) NOT NULL COMMENT '진료과목명',
  PRIMARY KEY (`HO_TREAT_SUBJECT_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='진료과목';

-- 테이블 데이터 bluesang7.ho_treat_subject:52 rows 내보내기
/*!40000 ALTER TABLE `ho_treat_subject` DISABLE KEYS */;
INSERT INTO `ho_treat_subject` (`HO_TREAT_SUBJECT_CODE`, `HO_TREAT_SUBJECT_NAME`) VALUES
	('0', '일반의'),
	('1', '내과'),
	('2', '신경과'),
	('3', '정신건강의학과'),
	('4', '외과'),
	('5', '정형외과'),
	('6', '신경외과'),
	('7', '흉부외과'),
	('8', '성형외과'),
	('9', '마취통증의학과'),
	('10', '산부인과'),
	('11', '소아청소년과'),
	('12', '안과'),
	('13', '이비인후과'),
	('14', '피부과'),
	('15', '비뇨기과'),
	('16', '영상의학과'),
	('17', '방사선종양학과'),
	('18', '병리과'),
	('19', '진단검사의학과'),
	('20', '결핵과'),
	('21', '재활의학과'),
	('22', '핵의학과'),
	('23', '가정의학과'),
	('24', '응급의학과'),
	('25', '직업환경의학과'),
	('26', '예방의학과'),
	('49', '치과'),
	('50', '구강악안면외과'),
	('51', '치과보철과'),
	('52', '치과교정과'),
	('53', '소아치과'),
	('54', '치주과'),
	('55', '치과보존과'),
	('56', '구강내과'),
	('57', '영상치의학과'),
	('58', '구강병리과'),
	('59', '예방치과'),
	('60', '치과소계'),
	('80', '한방내과'),
	('81', '한방부인과'),
	('82', '한방소아과'),
	('83', '한방안·이비인후·피부과'),
	('84', '한방신경정신과'),
	('85', '침구과'),
	('86', '한방재활의학과'),
	('87', '사상체질과'),
	('88', '한방응급'),
	('90', '한방소계'),
	('99', '해당사항없음'),
	('101', '예방접종'),
	('102', '건강검진');
/*!40000 ALTER TABLE `ho_treat_subject` ENABLE KEYS */;

-- 테이블 bluesang7.ho_vaccine 구조 내보내기
CREATE TABLE IF NOT EXISTS `ho_vaccine` (
  `HO_VACCINE_CODE` varchar(50) NOT NULL COMMENT '예방접종코드',
  `HO_TREATMENT_CODE` varchar(50) NOT NULL COMMENT '진료코드',
  `HO_VACCINE_TYPE_CODE` varchar(50) NOT NULL COMMENT '예방접종종류코드',
  `HO_VACCINE_COUNT` int(11) NOT NULL COMMENT '예방접종차수',
  `HO_VACCINE_DATE` datetime NOT NULL COMMENT '예방접종일',
  `HO_GO_SENDSTATE` int(11) DEFAULT '0' COMMENT '정부전송여부',
  PRIMARY KEY (`HO_VACCINE_CODE`),
  KEY `FK_ho_vaccine_type_TO_ho_vaccine` (`HO_VACCINE_TYPE_CODE`),
  KEY `FK_ho_treatment_TO_ho_vaccine` (`HO_TREATMENT_CODE`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='병원예방접종';

-- 테이블 데이터 bluesang7.ho_vaccine:2 rows 내보내기
/*!40000 ALTER TABLE `ho_vaccine` DISABLE KEYS */;
INSERT INTO `ho_vaccine` (`HO_VACCINE_CODE`, `HO_TREATMENT_CODE`, `HO_VACCINE_TYPE_CODE`, `HO_VACCINE_COUNT`, `HO_VACCINE_DATE`, `HO_GO_SENDSTATE`) VALUES
	('vaccine_1', 'treatment_1', 'vacination_13', 0, '2017-03-13 00:00:00', 1),
	('vaccine_2', 'treatment_2', 'vacination_13', 0, '2017-03-14 00:00:00', 1);
/*!40000 ALTER TABLE `ho_vaccine` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
