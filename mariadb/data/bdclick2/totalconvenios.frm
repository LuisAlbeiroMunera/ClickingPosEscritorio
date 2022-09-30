TYPE=VIEW
query=(select `bdclick2`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick2`.`bdordenservicio`.`valor` * `bdclick2`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick2`.`bdordenservicio` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdordenservicio`.`paciente` = `bdclick2`.`bdterceros`.`id`))) group by `bdclick2`.`bdordenservicio`.`convenio` having (`bdclick2`.`bdordenservicio`.`convenio` <> \'\'))
md5=7a106adb64b9ee2bd1dd752ed7b6c084
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:48
create-version=2
source=(select `bdordenservicio`.`convenio` AS `convenio`,sum((`bdordenservicio`.`valor` * `bdordenservicio`.`cantidad`)) AS `total` from (`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`id`))) group by `bdordenservicio`.`convenio` having (`bdordenservicio`.`convenio` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick2`.`bdordenservicio`.`valor` * `bdclick2`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick2`.`bdordenservicio` join `bdclick2`.`bdterceros` on((`bdclick2`.`bdordenservicio`.`paciente` = `bdclick2`.`bdterceros`.`id`))) group by `bdclick2`.`bdordenservicio`.`convenio` having (`bdclick2`.`bdordenservicio`.`convenio` <> \'\'))
mariadb-version=100135
