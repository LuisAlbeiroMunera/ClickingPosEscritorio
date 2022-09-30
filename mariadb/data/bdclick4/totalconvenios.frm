TYPE=VIEW
query=(select `bdclick4`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick4`.`bdordenservicio`.`valor` * `bdclick4`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick4`.`bdordenservicio` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdordenservicio`.`paciente` = `bdclick4`.`bdterceros`.`id`))) group by `bdclick4`.`bdordenservicio`.`convenio` having (`bdclick4`.`bdordenservicio`.`convenio` <> \'\'))
md5=c422977b9008a68bde33ac9bb0a74281
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:31
create-version=2
source=(select `bdordenservicio`.`convenio` AS `convenio`,sum((`bdordenservicio`.`valor` * `bdordenservicio`.`cantidad`)) AS `total` from (`bdordenservicio` join `bdterceros` on((`bdordenservicio`.`paciente` = `bdterceros`.`id`))) group by `bdordenservicio`.`convenio` having (`bdordenservicio`.`convenio` <> \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdordenservicio`.`convenio` AS `convenio`,sum((`bdclick4`.`bdordenservicio`.`valor` * `bdclick4`.`bdordenservicio`.`cantidad`)) AS `total` from (`bdclick4`.`bdordenservicio` join `bdclick4`.`bdterceros` on((`bdclick4`.`bdordenservicio`.`paciente` = `bdclick4`.`bdterceros`.`id`))) group by `bdclick4`.`bdordenservicio`.`convenio` having (`bdclick4`.`bdordenservicio`.`convenio` <> \'\'))
mariadb-version=100135
